package com.hastobe.transparenzsoftware.v100.gui.views.helper;

import com.hastobe.transparenzsoftware.v100.verification.xml.Value;

public class ValueIndexHolder {
    private final Value value;
    private final int initIndex;

    public ValueIndexHolder(Value value, int initIndex) {
        this.value = value;
        this.initIndex = initIndex;
    }

    public Value getValue() {
        return value;
    }

    public int getInitIndex() {
        return initIndex;
    }
}

