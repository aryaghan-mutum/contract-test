package com.contracttestpact.utils;

import lombok.extern.slf4j.Slf4j;

import java.nio.file.Files;
import java.nio.file.Paths;

@Slf4j
public class ReaderUtil {

    public static String readJsonFileAsString(String jsonFile) {
        String str = null;
        try {
            str = new String(Files.readAllBytes(Paths.get(jsonFile)));
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        
        return str;
    }
}
