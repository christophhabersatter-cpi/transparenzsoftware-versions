package com.hastobe.transparenzsoftware.v110.verification;

import com.hastobe.transparenzsoftware.v110.LocalizedException;

public class DecodingException extends LocalizedException {

    public DecodingException(String s, String localizedMessageKey) {
        super(s, localizedMessageKey);
    }

    public DecodingException(String s, String localizedMessageKey, Throwable e) {
        super(s, localizedMessageKey, e);
    }
}
