package com.hcl.payment.controller;

import com.hcl.payment.payload.ApiResponse;
import com.hcl.payment.payload.TransactionCreateRequest;
import com.hcl.payment.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/transaction")
@Validated
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createTransaction(@Valid @RequestBody TransactionCreateRequest request) {
        if(request.getPmtInfo().getPmtAmt() % 100 != 0) {
            return new ResponseEntity<>("Payment amount must only have 2 decimal fraction", new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }
        ApiResponse response  = transactionService.createTransaction(request);
        return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.ACCEPTED);
    }
}
