package com.demo.applicationLoader;

public class ApplicationLoader {

   // To get the count of special characters in the given string
    // Naveen is a Gre@t at his W0rk --> 1
    // @&#*Special Characters@^^$(*&$ -->  12

    // special -> if character is not Alphabet and not a digit and not a whiteSpace then it is special character
    //                              ~a and ~b and ~c == ~(a or b or c)
    public static int getSpecialCharacterCount(String inputString){
        int specialCharacterCount = 0 ;
        for (Character character : inputString.toCharArray()) {
            boolean isSpecialCharacter = !( Character.isLetter(character) || Character.isWhitespace(character) || Character.isDigit(character)) ;
            if (isSpecialCharacter){
                specialCharacterCount++ ;
            }
        }
        return specialCharacterCount ;
    }


    public static void main(String[] args) {

        System.out.println("Special character count in the String '200%40=5' is "+getSpecialCharacterCount("200%40=5"));

    }
}
