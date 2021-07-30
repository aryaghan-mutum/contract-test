package com.contracttestpact.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class ReaderUtil {

    public static String gePath(String jsonPath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.readValue(new File(jsonPath), String.class);
        return jsonStr;
    }

}
