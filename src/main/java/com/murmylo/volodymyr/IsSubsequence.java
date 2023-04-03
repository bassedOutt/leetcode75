package com.murmylo.volodymyr;

public class IsSubsequence {
    /*
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
    A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of
    the characters without disturbing the relative positions of the remaining characters.
    (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
    */
    public boolean isSubsequence(String s, String t) {
        int lastIndex = 0;
        for (char c : s.toCharArray()) {
            if (lastIndex > t.length()) {
                return false;
            }
            t = t.substring(lastIndex);
            int index = t.indexOf(c);
            if (index == -1) {
                return false;
            }
            lastIndex = index + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println(isSubsequence.isSubsequence("aaaaaa", "bbaaaa"));
    }
}
