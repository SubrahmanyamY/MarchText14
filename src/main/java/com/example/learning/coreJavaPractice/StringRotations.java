package com.example.learning.coreJavaPractice;

public class StringRotations {


    static boolean rotationString(String str1, String str2) {

        return (str1.length() == str2.length() && (str1 + str1).indexOf(str2) != -1);


    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "ADDC";

        if (rotationString(str1, str2)) {
            System.out.println("Both are each other");
        } else {
            System.out.println("Both are not each other");
        }


    }

}
