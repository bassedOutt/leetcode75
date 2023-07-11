package com.murmylo.volodymyr.plusone;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void plusOne() {
        Solution solution = new Solution();
        int[] ints = solution.plusOne(new int[]{1, 2, 3});
        assertEquals("[1 ,2 ,4]", Arrays.toString(ints));
    }
}