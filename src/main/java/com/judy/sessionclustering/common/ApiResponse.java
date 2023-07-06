package com.judy.sessionclustering.common;

import org.springframework.http.HttpStatus;

public class ApiResponse {

    private String resultCode;
    private String resultMessage;

    public ApiResponse() {
        this.resultCode = String.valueOf(HttpStatus.OK.value());
        this.resultMessage = HttpStatus.OK.getReasonPhrase();
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }
}
