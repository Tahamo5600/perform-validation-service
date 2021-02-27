package com.hcl.payment.payload;

import lombok.Data;

@Data
public class ApiResponse {
    private Object result;
    private int status;
    private String message;
}
