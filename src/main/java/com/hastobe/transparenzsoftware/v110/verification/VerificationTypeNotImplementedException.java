package com.hastobe.transparenzsoftware.v110.verification;

public class VerificationTypeNotImplementedException extends Throwable {

    private VerificationType unknownType;

    public VerificationTypeNotImplementedException(VerificationType verificationType) {
        super("Verification type " + verificationType + " not implemented");
        unknownType = verificationType;
    }

    public VerificationType getUnknownType() {
        return unknownType;
    }
}
