package com.hastobe.transparenzsoftware.v110.verification;

import com.hastobe.transparenzsoftware.v110.verification.result.Error;

public class VerificationException extends Exception {

    private Error error;

    public VerificationException(Error error) {
        super(error.getMessage());
        this.error = error;
    }

    public Error getError() {
        return error;
    }
}