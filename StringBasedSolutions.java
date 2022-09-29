package com.demo.applicationLoader;

import java.util.Arrays;

public class StringBasedSolutions {

    /*
        Agenda : Given two string find weather s2 can be obtained by rotation of characters in s1
        Strating from nth index then you should end at (n-1) index
        s1 -->  ABCD     s2 --> CDAB     ---> true
        s1 -->  ABCD     s2 --> ACBD     ---> false

        ABCDABCD  --> BCDA  CDAB  DABC

        Agenda : Given two strings it should return True if all character and their respective occurrences are same else false

        s1 -->  ABCD     s2 --> CDAB     ---> true
        s1 -->  ABCD     s2 --> ACBD     ---> true
    */

    public static boolean isOccurrencesAndCharactersSame(String firstInput , String secondInput){

        char[] firstArray = firstInput.toCharArray() ;
        char[] secondArray = secondInput.toCharArray() ;

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

       if (firstArray.length != secondArray.length)
           return false ;

        for (int i = 0 ; i< firstInput.length() ;i++){
            if (firstArray[i] != secondArray[i])
                return false ;
        }
       return true ;
    }

    public static boolean isRotationAllowed(String firstString , String secondString){
        String resultingString = firstString+firstString ;
        return resultingString.contains(secondString);
    }
    public static void main(String[] args) {
        System.out.println(" isRotationAllowed for DVFCGS to get GCSDVF : "+isRotationAllowed("DVFCGS","GCSDVF"));
        System.out.println(" isOccurrencesAndCharactersSame for 1234563 to get 4563321 : "+isOccurrencesAndCharactersSame("1234563","4563321"));
    }
}
