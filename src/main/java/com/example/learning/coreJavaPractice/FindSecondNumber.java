package com.example.learning.coreJavaPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindSecondNumber {
    public static void main(String[] args) {

        int[] numbers = {5, 9, 11, 2, 8, 66, 1};
        List<int[]> number1=Arrays.asList(numbers).stream().collect(Collectors.toList());

        System.out.println(""+ Arrays.toString(numbers));
        System.out.println("number1 "+ number1.toString());

        System.out.println("HHHH"+ Stream.of(numbers).findFirst().toString());

        int secondValue=  Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondValue);




        Integer num[] = {3,44,55,78,99};
        List<Integer> listnum= (List<Integer>) Arrays.asList(num);
        Integer listnum1 = listnum.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
         System.out.println("TTTTTT " +listnum1);

    }


}
