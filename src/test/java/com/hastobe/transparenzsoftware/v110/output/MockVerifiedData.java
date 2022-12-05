package com.hastobe.transparenzsoftware.v110.output;

import com.hastobe.transparenzsoftware.v110.verification.RegulationLawException;
import com.hastobe.transparenzsoftware.v110.verification.xml.Meter;
import com.hastobe.transparenzsoftware.v110.verification.xml.VerifiedData;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;

public class MockVerifiedData extends VerifiedData {

    double value = 0;
    OffsetDateTime timestamp;
    HashMap<String, Object> additionalData;
    List<Meter> meters;

    @Override
    public List<Meter> getMeters() {
        return meters;
    }

    @Override
    public String getFormat() {
        return null;
    }

    @Override
    public String getPublicKey() {
        return null;
    }

    @Override
    public String getEncoding() {
        return null;
    }

    @Override
    public HashMap<String, Object> getAdditionalData() {
        return additionalData;
    }

    @Override
    public boolean lawConform(VerifiedData stopValue) throws RegulationLawException {
        return true;
    }


}
