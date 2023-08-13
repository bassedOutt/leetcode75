package com.murmylo.volodymyr.array;

import java.util.Arrays;

class ArrayWhereEachElementIsSumOfPreviousElements {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        ArrayWhereEachElementIsSumOfPreviousElements solution = new ArrayWhereEachElementIsSumOfPreviousElements();
        System.out.println(Arrays.toString(solution.runningSum(new int[]{1, 3, 5, 7})));
    }
}