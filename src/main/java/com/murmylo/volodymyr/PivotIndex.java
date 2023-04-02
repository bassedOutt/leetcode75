package com.murmylo.volodymyr;


class PivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int i : nums) {
            totalSum += i;
        }
        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftsum * 2 == totalSum - nums[i]) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}