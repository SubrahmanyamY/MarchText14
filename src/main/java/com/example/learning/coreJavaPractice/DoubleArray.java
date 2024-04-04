package com.example.learning.coreJavaPractice;

public class DoubleArray {
    public static void main(String[] args) {

        int a[][] = {{1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}};


        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.printf(String.valueOf(a[i][j]));
            }
            System.out.println();
        }

    }

}
