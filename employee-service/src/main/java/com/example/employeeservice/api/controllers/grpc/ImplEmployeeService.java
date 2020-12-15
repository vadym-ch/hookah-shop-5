package com.example.employeeservice.api.controllers.grpc;

import com.example.employeeservice.services.EmployeeService;
import com.example.employeeservice.services.models.Employee;
import com.example.grpc.server.grpcserver.employee.CreateRequest;
import com.example.grpc.server.grpcserver.employee.CreateResponse;
import com.example.grpc.server.grpcserver.employee.DeleteRequest;
import com.example.grpc.server.grpcserver.employee.DeleteResponse;
import com.example.grpc.server.grpcserver.employee.GetRequest;
import com.example.grpc.server.grpcserver.employee.GetResponse;
import com.example.grpc.server.grpcserver.employee.ProtoEmployee;
import com.example.grpc.server.grpcserver.employee.EmployeeServiceGrpc.EmployeeServiceImplBase;

import org.springframework.beans.factory.annotation.Autowired;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.List;

@GrpcService
public class ImplEmployeeService extends EmployeeServiceImplBase {
    private final EmployeeService employeeService;

    @Autowired
    public ImplEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver) {
        List<Employee> employees = employeeService.getEmployees();

        List<ProtoEmployee> protoEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            ProtoEmployee protoEmployee = ProtoEmployee.newBuilder().setName(employee.getName())
                    .setSurname(employee.getSurname()).build();
            protoEmployees.add(protoEmployee);

        }
        GetResponse response = GetResponse.newBuilder().addAllEmployees(protoEmployees).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void create(CreateRequest request, StreamObserver<CreateResponse> responseObserver) {
        String name = request.getEmployee().getName();
        String surname = request.getEmployee().getSurname();
        Employee employee = employeeService.engageEmployee(name, surname);

        CreateResponse response = CreateResponse.newBuilder().setId(employee.getId()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteRequest request, StreamObserver<DeleteResponse> responseObserver) {
        String id = request.getId();
        String name = employeeService.getEmployeeById(id).getName();
        String surname = employeeService.getEmployeeById(id).getSurname();
        employeeService.deleteEmployeeById(id);

        DeleteResponse response = DeleteResponse.newBuilder()
                .setReport(name + " " + surname + " WAS DELETED SUCCESFULLY").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
