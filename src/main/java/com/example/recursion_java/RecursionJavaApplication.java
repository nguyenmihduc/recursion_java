package com.example.recursion_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.SortedSet;

@SpringBootApplication
public class RecursionJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecursionJavaApplication.class, args);
        String result = stringReverse2("hello minh duc");
        System.out.println(result);
//        String test = "abcd";
//        System.out.println(test.substring(1));
//        System.out.println(test.charAt(0));

    }

    public static String stringReverse(String input) {
        if (input.length() == 0) {
            return "";
        }
        String result = input.substring(input.length() - 1);
        String nextStep = input.substring(0, input.length() - 1);
        return result + stringReverse(nextStep);
    }

    public static String stringReverse2(String input) {
        System.out.println(input);
        if (input.equals("")) {
            return "";
        }
        return stringReverse2(input.substring(1)) + input.charAt(0);
    }

}