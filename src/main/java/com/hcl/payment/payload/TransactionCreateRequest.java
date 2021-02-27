package com.hcl.payment.payload;

import lombok.Data;
import org.springframework.lang.NonNull;

import javax.validation.constraints.*;
import java.math.BigDecimal;

@Data
public class TransactionCreateRequest {

    @NotBlank
    private String messageId;
    @NotBlank
    private String e2eId;
    @NotNull
    private Account creditor;
    @NotNull
    private Account debitor;
    @NotBlank
    private String givenCntry;
    @NotNull
    private PaymentInfo pmtInfo;

    @Data
    public static class Account{

        @Pattern(regexp = "^[A-Za-z0-9]*$")
        @Size(max = 35, message = "account must have 35 chars")
        private String accountId;
        private String name;
        private String address;
        @Size(max = 6, message = "agentIdentifier must have 6 chars")
        private String agentIdentifier;
        private String acctStatus;
        private Double acctBal;
    }

    @Data
    public static class PaymentInfo{
        @Pattern(regexp = "EUR")
        private String pmtCur;
        private Double pmtAmt;
        private Long valDate;
    }
}
