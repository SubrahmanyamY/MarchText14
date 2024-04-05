package com.example.learning.coreJavaPractice;

public class BunniesObjectCount {
     static int count=0;

    BunniesObjectCount(){
        while(count<10)
            new BunniesObjectCount(++count);
    }

   BunniesObjectCount(int x){

    }

    public static void main(String[] args) {

        new BunniesObjectCount();
        new BunniesObjectCount(count);
        System.out.println(count);

    }




}
