package com.example.demo.controller;

import com.example.demo.payload.ApiResponse;
import com.example.demo.payload.TransactionCreateRequest;
import com.example.demo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/transaction")
@Validated
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createTransaction(@Valid TransactionCreateRequest request) {
        ApiResponse response  = transactionService.createTransaction(request);
        return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.ACCEPTED);
    }
}
