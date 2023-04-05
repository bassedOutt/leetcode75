package com.murmylo.volodymyr;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestPalindrome {


    /**
     * <a href="ttps://leetcode.com/problems/longest-palindrome/?envType=study-plan&id=level-1">LeetCode</a>
     * * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome
     * that can be built with those letters.
     * Letters are case-sensitive, for example, "Aa" is not considered a palindrome here.
     */
    public int longestPalindrome(String s) {
        Map<Character, Long> charOccurenceMap = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Collection<Long> values = charOccurenceMap.values();

        boolean firstOddElementFound = false;

        long sum = 0L;
        for (Long value : values) {
            if (value % 2 != 0) {
                if (firstOddElementFound) {
                    sum += value - 1;
                } else {
                    sum += value;
                    firstOddElementFound = true;
                }
            } else sum += value;
        }
        return (int) sum;
    }

    public int longestPalindromeSolution2(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            ++freq[c];
        }
        int odds = 0;
        for (int i : freq) {
            odds += i & 1;
        }
        //one odd is allowed
        odds -= odds > 0 ? 1 : 0;
        return s.length() - odds;
    }
}
