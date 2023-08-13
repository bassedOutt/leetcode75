package com.murmylo.volodymyr.array;

import java.util.Stack;

public class PlusOne {
    public int[] plusOneUsingStack(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        boolean isZero = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            if (isZero) {
                digit += 1;
            }
            if (digit == 10) {
                stack.push(0);
                if (i == 0) stack.push(1);
            } else {
                stack.push(digit);
                isZero = false;
            }
        }
        int[] newDigits = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            newDigits[index++] = stack.pop();
        }
        return newDigits;
    }

    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }
}