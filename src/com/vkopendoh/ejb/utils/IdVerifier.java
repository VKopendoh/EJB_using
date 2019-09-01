package com.vkopendoh.ejb.utils;

import java.util.Arrays;

public class IdVerifier {
    private static final String[] VALID_IDS = {"0", "123","456"};
    public boolean validate(String id){
        return Arrays.asList(VALID_IDS).contains(id);
    }
}
