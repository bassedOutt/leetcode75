package com.murmylo.volodymyr.exteme_programming;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class FirstBadVersion {

    //Just example api, since there's no real API
    boolean isBadVersion(int version) {
        if (version >= 4) {
            return true;
        }
        return false;
    }


    /**
     * You are a product manager and currently leading a team to develop a new product.
     * Unfortunately, the latest version of your product fails the quality check.
     * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
     * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
     * which causes all the following ones to be bad.
     * You are given an API bool isBadVersion(version) which returns whether version is bad.
     * Implement a function to find the first bad version. You should minimize the number of calls to the API.
     * <p>
     * Input: n = 5, bad = 4
     * Output: 4
     * Explanation:
     * call isBadVersion(3) -> false
     * call isBadVersion(5) -> true
     * call isBadVersion(4) -> true
     * Then 4 is the first bad version.
     * <a href="https://leetcode.com/problems/first-bad-version/?envType=study-plan&id=level-1">leet code</a>
     */
    public int firstBadVersion(int n) {
        int left = 0, right = n;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
}
