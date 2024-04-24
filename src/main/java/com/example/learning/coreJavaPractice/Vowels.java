package com.example.learning.coreJavaPractice;

import java.util.Arrays;
import java.util.List;

public class Vowels {

    public static void main(String[] args) {


        String abc="HellomyeeIourriiiid".toLowerCase();


        List<Character> chr= Arrays.asList('a','e','i','o','u');
        long vowelCount=abc.chars().filter(c->chr.contains((char) c)).count();

        System.out.println(vowelCount);




       /* String str = "HelloJava*##&&777";

        String str2 = str.replaceAll(
                "[^a-zA-Z]", "");
        System.out.println("str2  lll " + str2);

        String str1 = "";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isDigit(str.charAt(i))
                    && !Character.isLetter(str.charAt(i))
                    && !Character.isWhitespace(str.charAt(i))) {
                // count++;
                str1 = str1 + str.charAt(i);


            }

        }

        System.out.println("str1  lll "+str1);
*/
    }



}

