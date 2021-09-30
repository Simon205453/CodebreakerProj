package com.company;

public class CaesarEncoder {
    public static String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";


    public static String ceasarEncode(String givenString) {
        String encodedString = "";
        int givenStringLenght = givenString.length();
        givenString.toLowerCase();
        for (int i = 0; i < givenStringLenght; i++) {
            int indexInAlphabet = alphabet.indexOf(givenString.indexOf(i));
            indexInAlphabet = indexInAlphabet + givenStringLenght % 29;
            encodedString += String.valueOf(alphabet.charAt(indexInAlphabet));
        }
        return encodedString;
    }

    public static String ceasarDecode(String givenString) {
        String decodedString = "";
        int givenStringLenght = givenString.length();
        givenString.toLowerCase();
        for (int i = 29; i < givenStringLenght; i = i - 1) {
            int indexInAlphabet = alphabet.indexOf(givenString.indexOf(i));
            indexInAlphabet = indexInAlphabet - givenStringLenght % 29;
            decodedString += String.valueOf(alphabet.charAt(indexInAlphabet));
        }

        return decodedString;
    }
}
