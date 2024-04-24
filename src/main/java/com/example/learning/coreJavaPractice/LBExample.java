package com.example.learning.coreJavaPractice;

import io.micrometer.observation.Observation;

public class LBExample {
    public static void main(String[] args) {

        Runnable hello = () -> {
            System.out.println("Hello");
        };


    }
}
