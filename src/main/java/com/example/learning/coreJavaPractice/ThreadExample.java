package com.example.learning.coreJavaPractice;

import java.util.Arrays;
import java.util.OptionalInt;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {



       /* Thread t= new Thread();
        Thread t1= new Thread();
        Thread t2= new Thread();
        t.start();

        t1.start();
        t2.start();
        t.join(500);
        System.out.println(t.toString());
        System.out.println(t1.toString());
        System.out.println(t2.toString());*/

        int[] arr={1,3,4,5,6,2,1};

        int[] arr1={1,3,5,4,7,2};

       OptionalInt i=  Arrays.stream(arr).sorted().skip(2).findFirst();

      OptionalInt j= Arrays.stream(arr).distinct().sorted().skip(2).findFirst();


      System.out.println("  >>> "+i);
        System.out.println("  >>>> "+j);

    }


}
