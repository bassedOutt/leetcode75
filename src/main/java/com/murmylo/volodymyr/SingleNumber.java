package com.murmylo.volodymyr;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int num : nums) {
            numCount.compute(num, (k, v) -> (v == null) ? 1 : v + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
