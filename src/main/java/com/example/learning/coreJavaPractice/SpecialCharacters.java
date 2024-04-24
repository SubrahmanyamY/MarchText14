package com.example.learning.coreJavaPractice;

public class SpecialCharacters {
    public static void main(String[] args) {
        String str= "This#string%contains^special*characters&5555555.";
        //str = str.replaceAll("[^a-zA-Z0-9]", " ");
        str = str.replaceAll("[^a-zA-Z]", " ");
        System.out.println(str);
    }

}
