package com.example.demo.service;

import com.example.demo.payload.ApiResponse;
import com.example.demo.payload.TransactionCreateRequest;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public ApiResponse createTransaction(@NonNull TransactionCreateRequest request) {
        return null;
    }
}
