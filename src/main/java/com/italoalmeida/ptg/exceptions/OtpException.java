package com.italoalmeida.ptg.exceptions;

import org.springframework.http.HttpStatus;

public class OtpException extends Exception {

    private static final long serialVersionUID = -4037169155458914446L;
    @Override
    public String getMessage() {
        return "Enter OTP is not correct";
    }

    public int getCode() {
        return HttpStatus.BAD_REQUEST.value();
    }

    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

}
