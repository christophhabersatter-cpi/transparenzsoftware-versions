package com.hastobe.transparenzsoftware.v100.verification;


public class FormatComparisonException extends ValidationException {
    public FormatComparisonException() {
        super("Cannot compare data from different format", "app.verify.law.conform.different.formats");
    }

}
