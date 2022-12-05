package com.hastobe.transparenzsoftware.v110;

import com.hastobe.transparenzsoftware.v110.i18n.Translator;

public abstract class LocalizedException extends Exception {

    protected String localizedMessageKey;

    public LocalizedException(String s, String localizedMessageKey) {
        super(s);
        this.localizedMessageKey = localizedMessageKey;
    }

    public LocalizedException(String s, String localizedMessageKey, Throwable throwable) {
        super(s, throwable);
        this.localizedMessageKey = localizedMessageKey;
    }

    @Override
    public String getLocalizedMessage() {
        return Translator.get(localizedMessageKey);
    }

    public String getLocalizedMessageKey(){
        return localizedMessageKey;
    }
}