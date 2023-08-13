package com.murmylo.volodymyr.plusone;

import com.murmylo.volodymyr.array.PlusOne;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusOneTest {

    @Test
    void plusOne() {
        PlusOne plusOne = new PlusOne();
        int[] ints = plusOne.plusOne(new int[]{1, 2, 3});
        assertEquals("[1 ,2 ,4]", Arrays.toString(ints));
    }
}