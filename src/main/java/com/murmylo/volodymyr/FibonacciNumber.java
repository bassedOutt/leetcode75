package com.murmylo.volodymyr;

public class FibonacciNumber {
    public int fib(int n) {
        int result = 0;
        int first = 1;
        int second = 1;
        for (int i = 0; i < n - 2; i++) {
            result = first + second;
            second = result;
            first = second;
        }

        return result;
    }

    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println(fibonacciNumber.fib(4));
    }
}
