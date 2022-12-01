package com.hastobe.transparenzsoftware.v100.verification;

import com.hastobe.transparenzsoftware.v100.verification.result.Error;

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
