package com.hastobe.transparenzsoftware.v110.verification;

import com.hastobe.transparenzsoftware.v110.LocalizedException;

public class RegulationLawException extends LocalizedException {
    public RegulationLawException(String s, String localizedMessageKey) {
        super(s, localizedMessageKey);
    }

    public RegulationLawException(String s, String localizedMessageKey, Throwable throwable) {
        super(s, localizedMessageKey, throwable);
    }
}
