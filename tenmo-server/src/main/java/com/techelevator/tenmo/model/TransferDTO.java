package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class TransferDTO {

    private int fromUser;
    private int toUser;
    private BigDecimal amount;
    private int transferStatus;
    private int transferType;


    public TransferDTO(int fromUser, int toUser, BigDecimal amount, int transferStatus, int transferType) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amount = amount;
        this.transferStatus = transferStatus;
        this.transferType = transferType;
    }

    public int getFromUser() {
        return fromUser;
    }

    public void setFromUser(int fromUser) {
        this.fromUser = fromUser;
    }

    public int getToUser() {
        return toUser;
    }

    public void setToUser(int toUser) {
        this.toUser = toUser;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getTransferStatus() {
        return transferStatus;
    }

    public int getTransferType() {
        return transferType;
    }
}

