package com.example.tobakkoservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BalanceUpdateRequest {
    String paymentId;
    int price;
}
