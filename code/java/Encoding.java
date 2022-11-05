package com.chocolateminds.encoding;

import java.util.Base64;

/**
 * An utility class to encode a text as base64
 */
public class Encoding {
    String secretMessage = "Sunday Lunch at Konda's";
    Base64.Encoder encoder = Base64.getEncoder();
    Base64.Decoder decoder = Base64.getDecoder();

    /**
     * Encoding a piece of string
     * @return
     */
    private String encode(){
        String encoded = Base64.getEncoder().encodeToString(secretMessage.getBytes());
        return encoded;
    }

    public static void main(String[] args) {
        Encoding encoding = new Encoding();
        System.out.println(encoding.encode());
    }
}
