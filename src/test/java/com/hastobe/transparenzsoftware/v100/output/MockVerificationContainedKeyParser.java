package com.hastobe.transparenzsoftware.v100.output;

import com.hastobe.transparenzsoftware.v100.verification.ContainedPublicKeyParser;
import com.hastobe.transparenzsoftware.v100.verification.VerificationParser;

public class MockVerificationContainedKeyParser extends MockVerificationParser implements VerificationParser, ContainedPublicKeyParser {

    public String parsePublicKeyResult;

    @Override
    public String parsePublicKey(String data) {
        return parsePublicKeyResult;
    }

    @Override
    public String createFormattedKey(String data) {
        return data;
    }
}
