package com.example.recursion_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class RecursionJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecursionJavaApplication.class, args);
        int k = 5;
        System.out.println(k);
//        long result = fibo(4);
//        System.out.println(result);
    }

//    public static void mergeSort(int[] data, int start, int end) {
//        if (start < end) {
//            int mid = (start + end) / 2;
//            mergeSort(data, start, mid);
//            mergeSort(data, mid + 1, end);
//            merge(data, start, mid, end);
//        }
//    }
//
//    public static void merge(int[] data, int start, int mid, int end) {
//        int[] temp = new int[end - start + 1];
//
//        int i = start, j = mid + 1, k = 0;
//
//        while (i <= mid && j <= end) {
//            if (data[i] <= data[j]) {
//                temp[k++] = data[i++];
//            } else {
//                temp[k++] = data[j++];
//            }
//        }
//
//        while (i <= mid) {
//            temp[k] = data[i];
//        }
//    }

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

    public static String decimalToBinary(int input) {
        if (input < 1) {
            return "";
        }
        int result = input % 2;
        String intToStr = Integer.toString(result);
        int nextInput = input / 2;
        return decimalToBinary(nextInput) + intToStr;
    }

    public static String decimalToBinary2(int input, String result) {
        if (input == 0) {
            return result;
        }
        result = input % 2 + result;

        return decimalToBinary2(input / 2, result);
    }

    public static int sumOfNaturalNumber(int input) {
        if (input <= 1) {
            return input;
        }
        int nextInput = input - 1;
        return input + sumOfNaturalNumber(nextInput);
    }

    public static int binarySearch(int[] A, int left, int right, int x)  {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;

        if (x == A[mid]) {
            return mid;
        }
        if (x < A[mid]) {
            return binarySearch(A, left, mid -1, x);
        }
        return binarySearch(A, mid + 1, right, x);
    }

//    public static long fibo(long n) {
//        if ( n == 0 || n == 1) {
//            return n;
//        } else {
//            return fibo(n -1) + fibo(n -2);
//        }
//    }
}
