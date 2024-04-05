package com.example.learning.coreJavaPractice;

public class RemovecharOccurrences {

    public static String removechar(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ch) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "geeksforgeeks";
        char ch = 'e';
        System.out.println(removechar(word, ch));

    }


}
