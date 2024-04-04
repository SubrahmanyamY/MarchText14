package com.example.learning.coreJavaPractice;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> numbersList
                = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        //Collectors.toSet()
        Set<Integer> list1 = numbersList.stream().collect(Collectors.toSet());
        System.out.println("list1 ::" + list1);

        //distinct strings
        List<String> stringList = new ArrayList<>(Arrays.asList("A", "A", "B", "C", "D", "D", "E", "E"));
        List<String> distinctItems = stringList.stream().distinct().collect(Collectors.toList());
        System.out.println("distinctItems ::" + distinctItems);

        //to map
        ArrayList<Integer> numbersList1 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        Map<Integer, Long> elementCountMap = numbersList1.stream()
                .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));

        System.out.println("elementCountMap" + elementCountMap);
    }

}
