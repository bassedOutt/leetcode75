package com.murmylo.volodymyr.strings;

import java.util.Arrays;
import java.util.OptionalInt;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        OptionalInt min = Arrays.stream(strs)
                .mapToInt(String::length)
                .min();
        int length = min.orElse(0);
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                char el = strs[j].charAt(i);
                if (el != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, length);
    }
}
