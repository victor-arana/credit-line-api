package com.tribal.creditline.model;

import java.time.LocalDateTime;

public class CreditLineRequest {
    private FoundingType foundingType;
    private Double cashBalance;
    private Double monthlyRevenue;
    private Double requestedCreditLine;
    private LocalDateTime requestedDate;

    public FoundingType getFoundingType() {
        return foundingType;
    }

    public void setFoundingType(FoundingType foundingType) {
        this.foundingType = foundingType;
    }

    public Double getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(Double cashBalance) {
        this.cashBalance = cashBalance;
    }

    public Double getMonthlyRevenue() {
        return monthlyRevenue;
    }

    public void setMonthlyRevenue(Double monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }

    public Double getRequestedCreditLine() {
        return requestedCreditLine;
    }

    public void setRequestedCreditLine(Double requestedCreditLine) {
        this.requestedCreditLine = requestedCreditLine;
    }

    public LocalDateTime getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(LocalDateTime requestedDate) {
        this.requestedDate = requestedDate;
    }
}
