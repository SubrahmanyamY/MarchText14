package com.example.learning.coreJavaPractice;


import lombok.val;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class TestPractice {
    public static void main(String[] args) {
        Integer[] num={1,2,3,4,7,9,6,0};
        List<Integer> listInteger= Arrays.asList(num);
        Integer num2= listInteger.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(num2);


        //vowels
        String str="iiiiieeeoouuaaaYYYrrrppppp".toLowerCase();
        List<Character> charList= Arrays.asList('a','e','i','o','u');
       long str2= str.chars().filter(c->charList.contains((char) c)).count();
        System.out.println(str2);


        //char occurence
        String input="HelloWorldaaaeeiiou";
        Map<String,Long> map= Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        //duplicate elements
       List<Map.Entry<String, Long>> duplicateElements=  Arrays.stream(input.split(""))
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
               .entrySet().stream().filter(x->x.getValue()>1)
               .collect(Collectors.toList());
       System.out.println(duplicateElements);

      // unique Elemnets
        List<String> uniqueElements = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().stream().filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(uniqueElements);

        //nonrepat elemnts

        String nonrepatElements = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
        System.out.println(nonrepatElements);


        //comparing length
        String[] strArray={"Apple","Banana","Mango","Guvva","pineapple"};
        OptionalInt maxlength= Arrays.asList(strArray).stream().mapToInt(strArray1->strArray1.length()).max();
        OptionalInt minlength= Arrays.asList(strArray).stream().mapToInt(x->x.length()).min();
        System.out.println(maxlength);
        System.out.println(minlength);



        ArrayList<String> strList= new ArrayList<String>();
        strList.add("Apple");
        strList.add("Bananna");
        strList.add("Guvva");
        strList.add("Orange");
        strList.add("Grapes");
        System.out.println("NNN "+ strList);

        for(String str4: strList){
            System.out.println("str4 "+ str4.length());
        }

        Iterator itr=strList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
