package com.example.recursion_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RecursionJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecursionJavaApplication.class, args);
        boolean result = isPalindrome("abcdeedcba");
        System.out.println(result);

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
        if (input.equals("")) {
            return "";
        }
        return stringReverse2(input.substring(1)) + input.charAt(0);
    }


    public static boolean isPalindrome(String input) {
        if (input.length() == 1 || input.equals("")) {
            return true;
        } else {
            char first = input.charAt(0);
            char last = input.charAt(input.length() -1);
            if (first == last) {
                String nextStep = input.substring(1, input.length() -1);
                return isPalindrome(nextStep);
            } else {
                return false;
            }
        }
    }
}
