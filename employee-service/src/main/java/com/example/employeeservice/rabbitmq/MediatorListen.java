package com.example.employeeservice.rabbitmq;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.employeeservice.services.EmployeeService;
import com.example.employeeservice.services.models.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

@Component
public class MediatorListen {
	private final static String ADDING = "employee_adding";
	private final static String DELETING = "employee_deleting";
	private final EmployeeService employeeService;

	@Autowired
	public MediatorListen(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@PostConstruct
	public void consumeCreateMessageFromQueue() throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();

		channel.queueDeclare(ADDING, true, false, false, null);
		System.out.println(" [*] Waiting for messages...");

		DeliverCallback deliverCallback = (consumerTag, delivery) -> {
			String message = new String(delivery.getBody(), "UTF-8");
			Employee employee = new ObjectMapper().readValue(message, Employee.class);

			System.out.println(" [x] Received message to create'" + employee + "'");
			employeeService.createEmployee(employee);
		};
		channel.basicConsume(ADDING, true, deliverCallback, consumerTag -> {
		});
	}

	@PostConstruct
	public void consumeDeleteMessageFromQueue() throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();

		Channel channel = connection.createChannel();

		channel.queueDeclare(DELETING, true, false, false, null);
		System.out.println(" [*] Waiting for messages...");

		DeliverCallback deliverCallback = (consumerTag, delivery) -> {
			String id = new String(delivery.getBody(), "UTF-8");
			System.out.println(" [x] Received message to delete employee with id '" + id + "'");
			employeeService.deleteEmployeeById(id);
		};
		channel.basicConsume(DELETING, true, deliverCallback, consumerTag -> {
		});
	}

	// Creating consumer with @RabbitListener
	/*
	 * @RabbitListener(queues = ADDING) public void
	 * consumeCreateMessageFromQueue(String message) throws JsonMappingException,
	 * JsonProcessingException { Employee employee = new
	 * ObjectMapper().readValue(message, Employee.class);
	 * System.out.println(" [x] Received create '" + employee + "'");
	 * //employeeService.createEmployee(employee); }
	 * 
	 * @RabbitListener(queues = DELETING) public void
	 * consumeDeleteMessageFromQueue(String message) throws JsonMappingException,
	 * JsonProcessingException { String id = message;
	 * System.out.println(" [x] Received request ' delete employee with id " + id +
	 * "'"); //employeeService.deleteEmployeeById(id); }
	 */

}
