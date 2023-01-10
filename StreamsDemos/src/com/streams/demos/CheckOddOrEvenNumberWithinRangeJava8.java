package com.streams.demos;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckOddOrEvenNumberWithinRangeJava8 {

	public static void main(String args[]) {

        retrieveOddNumbersWithinRange(10, 25);

        retrieveEvenNumbersWithinRange(10, 25);

    }

    public static void retrieveOddNumbersWithinRange(int start, int end) {
        System.out.println("ODD NUMBERS WITHIN THE RANGE OF 10 AND 25");

        //1st way
        System.out.println("1st way: ");
        //IntStream.range(10, 25).filter(i -> i % 2 != 0).limit(4).forEach(System.out::println);
        
        IntStream.range(10, 25).filter(i -> i % 2 != 0).limit(4).forEach(i -> System.out.println(i));
        
        
        

//        //2nd way (traditional way - before java 8)
//        System.out.println("\n 2nd way: \n");
//        for (int i = start; i <= end; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//
//        //3rd way
//        System.out.println("\n 3rd way: \n");
//        Stream.iterate(start, i -> i + 1).filter(CheckOddOrEvenNumberWithinRangeJava8::isOdd).limit(8).forEach(System.out::println);
    }

    public static void retrieveEvenNumbersWithinRange(int start, int end) {
        System.out.println("\nEVEN NUMBERS WITHIN THE RANGE OF 10 AND 25");

        //1st way
        System.out.println("1st way: ");
        IntStream.range(start, end + 1).filter(i -> i % 2 == 0).limit(4).forEach(System.out::println);

//        //2nd way (traditional way - before java 8)
//        System.out.println("\n 2nd way: \n");
//        for (int i = start; i <= end; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//
//        //3rd way
//        System.out.println("\n 3rd way: \n");
//        Stream.iterate(start, i -> i + 1).filter(CheckOddOrEvenNumberWithinRangeJava8::isEven).limit(8).forEach(System.out::println);
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }


}
