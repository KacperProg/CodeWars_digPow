package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Given two positive integers n and p, we want to find a positive integer k,
        // if it exists, such that the sum of the digits of n raised to consecutive powers
        // starting from p is equal to k * n.
        //

        long validate = digPow(89,1);
    }

    public static long digPow(int n, int p) {
        // your code
        // List<Integer> nDigits = Lists.newArrayList()
        LinkedList<Integer> digits = new LinkedList<>();
        while(n > 0){
            digits.push(n % 10);
            n /= 10;
        }
        return -1;
    }
}