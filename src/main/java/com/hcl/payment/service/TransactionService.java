package com.hcl.payment.service;

import com.hcl.payment.payload.ApiResponse;
import com.hcl.payment.payload.TransactionCreateRequest;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

    @Transactional
    public ApiResponse createTransaction(@NonNull TransactionCreateRequest request) {
        return null;
    }
}
