package com.murmylo.volodymyr;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int remainder = target - num;
            if (numsIndex.containsKey(remainder)) {
                return new int[]{i, numsIndex.get(remainder)};
            }
            numsIndex.put(num, i);
        }
        return null;
    }

}
