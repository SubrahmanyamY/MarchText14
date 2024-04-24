package com.example.learning.coreJavaPractice;

public class SingletoneExample {

    private static SingletoneExample se;

    private SingletoneExample() {

    }

    public static SingletoneExample getInstance() {
        if (se == null) {
            se = new SingletoneExample();
        }
        return se;
    }


    public static void main(String[] args) {

        System.out.println(getInstance().toString());

    }


}
