package com.hastobe.transparenzsoftware.v110.verification.format.alfen;

import com.hastobe.transparenzsoftware.v110.verification.ValidationException;

public class AlfenValidationException extends ValidationException {

    public AlfenValidationException(String s) {
        super(s);
    }

    public AlfenValidationException(String message, String localizedKey) {
        super(message, localizedKey);
    }

    public AlfenValidationException(String message, String localizedKey, Throwable throwable) {
        super(message, localizedKey, throwable);
    }

    public AlfenValidationException(String s, Throwable throwable) {
        super(s, throwable);
    }

    @Override
    public String getLocalizedMessageKey() {
        return localizedMessageKey == null ? "error.alfen.validation" : localizedMessageKey;
    }
}