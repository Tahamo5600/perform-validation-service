package com.hcl.payment.payload;

import lombok.Data;

@Data
public class TransactionCreateRequest {

    private String messageId;
    private String e2eId;
    private Account creditor;
    private Account debitor;
    private String givenCntry;
    private PaymentInfo pmtInfo;

    @Data
    public static class Account{
        private String acctStatus;
        private Double acctBal;
    }

    @Data
    public static class PaymentInfo{
        private String pmtCur;
        private Double pmtAmt;
        private Long valDate;
    }
}
