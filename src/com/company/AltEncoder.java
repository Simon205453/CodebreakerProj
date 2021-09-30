package com.company;

import java.util.Base64;
import java.util.Scanner;

public class AltEncoder {
    public static String encodedString;


    public static String stringEncoder(String givenString) {

        Base64.Encoder encoder = Base64.getEncoder();
        encodedString = encoder.encodeToString(givenString.getBytes());
        System.out.println("Encoded string: " + encodedString);
        return encodedString;
    }

    public static String stringDecoder(String givenString) {

        Base64.Decoder decoder = Base64.getDecoder();
        String decodedString = new String(decoder.decode(encodedString));
        System.out.println("Decoded string: " + decodedString);
        return decodedString;
    }
/*
        System.out.println("Given string is: " + givenString + "\n Program will now encrypt");
        int givenStringLenght = givenString.length();
        givenString = givenString.toLowerCase();
*/



/*
        for(int i = 0; i < givenStringLenght; i++){
            givenString.charAt(i);

        }
*/


}