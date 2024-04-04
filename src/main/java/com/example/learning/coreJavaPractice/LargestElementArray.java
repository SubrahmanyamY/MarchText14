package com.example.learning.coreJavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementArray {


    static int[] arry = {3, 4, 6, 99, 444444444, 77, 100, 44, 90000, 10000000};

    static int lagerst() {
        int max = arry[0];
        // int i = 1;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > max) max = arry[i];
        }
        return max;

    }

    public static void main(String[] args) {


        //forloop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth of element");
        int element = sc.nextInt();
        for (int j = 0; j < arry.length; j++) {
            if (element == j + 1) {
                System.out.println("Position " + element + " element of given Array is " + arry[j]);
            }
        }

        System.out.println("largest element ::" + lagerst());

        //streams
        int max1 = Arrays.stream(arry).max().getAsInt();
        System.out.println("max1:: " + max1);

        //infinite loop
        for(;;) {
            System.out.println("hello");
        }

    }


}
