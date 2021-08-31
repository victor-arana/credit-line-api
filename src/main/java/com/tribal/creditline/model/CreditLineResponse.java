package com.tribal.creditline.model;

public class CreditLineResponse {
    private String code;
    private String message;
    private String creditLine;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(String creditLine) {
        this.creditLine = creditLine;
    }
}
