package com.hastobe.transparenzsoftware.v100.verification.format.sml;

import com.hastobe.transparenzsoftware.v100.verification.ValidationException;

public class SMLValidationException extends ValidationException {
    public SMLValidationException(String s) {
        super(s);
    }

    public SMLValidationException(String message, String localizedKey) {
        super(message, localizedKey);
    }

    public SMLValidationException(String message, String localizedKey, Throwable throwable) {
        super(message, localizedKey, throwable);
    }

    public SMLValidationException(String s, Throwable throwable) {
        super(s, throwable);
    }

    @Override
    public String getLocalizedMessageKey() {
        return localizedMessageKey == null ? "error.sml.validation" : localizedMessageKey;
    }
}
