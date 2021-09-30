package com.company;

import java.util.Scanner;

public class Main {
    public static String givenString = "";
    public static String cypheredString = "";

    public static boolean checkIfStringIsValid(String givenString) {
        return !givenString.matches(".*\\d.*");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Come with a String:");
            givenString = scanner.nextLine();
            if (!checkIfStringIsValid(givenString)) {
                System.out.println("Invalid String input \n try again.");
            }
        } while (!checkIfStringIsValid(givenString));
        //Negating methodcall because loop runs while true, and i only want it to loop when its NOT valid (poor method name)

        System.out.println("Do you want to use Caesar Encoder/Decoder or alternative Encoder/Decoder?\n Type: \n 1 - Caesar \n 2 - Alternative");
        int chosenCypher = scanner.nextInt();
        //first layer of if statement for which encoder to use
        if (chosenCypher == 1) {
            System.out.println("You have chosen Caesar, now would you like your string encoded or decoded? \n Type: \n 1 - Encode \n 2 - Decode");
            int encodeOrDecode = scanner.nextInt();
            //second layer of if statement for whether user chooses to encode or decode
            if (encodeOrDecode == 1) {
                cypheredString = CaesarEncoder.ceasarEncode(givenString);
                System.out.println("Encoded string: " + cypheredString);
            } else if (encodeOrDecode == 2) {
                cypheredString = CaesarEncoder.ceasarDecode(givenString);
                System.out.println("Decoded string: " + cypheredString);
            } else {
                System.out.println("Invalid input");
            }
        } else if (chosenCypher == 2) {
            System.out.println("You have chosen Alternative, now would you like your string encoded or decoded? \n Type: \n 1 - Encode \n 2 - Decode");
            int encodeOrDecode = scanner.nextInt();
            if (encodeOrDecode == 1) {
                AltEncoder.stringEncoder(givenString);
            } else if (encodeOrDecode == 2) {
                AltEncoder.stringDecoder(givenString);
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }


    }


}
