package com.example.learning.coreJavaPractice;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CompareTwoStrings {

    //Arrays

    static boolean sameChars(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {

        String str1 = "ByeBye PK";
        String str2 = "Bye Bye PK";


        System.out.println("compare " + sameChars(str1, str2));

        if (!str1.equals(str2)) {
            System.out.println("Both are not equal");
        } else {
            System.out.println("Both are equal");
        }


        char[] charArr = {'a', 'b', 'c'};
        char[] charArr1 = {'a', 'b', 'c'};


        boolean areEqual = IntStream.range(0, charArr.length)
                .allMatch(index -> charArr[index] == charArr1[index]);


        System.out.println("The arrays are equal: " + areEqual);

    }

}
