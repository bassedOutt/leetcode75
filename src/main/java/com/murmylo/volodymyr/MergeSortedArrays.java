package com.murmylo.volodymyr;

import java.util.Arrays;

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = m - 1;
        int idx2 = n - 1;
        int mergedIdx = m + n - 1;

        while (idx1 >= 0 && idx2 >= 0) {
            if (nums1[idx1] > nums2[idx2]) {
                nums1[mergedIdx] = nums1[idx1];
                idx1--;
            } else {
                nums1[mergedIdx] = nums2[idx2];
                idx2--;
            }
            mergedIdx--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (idx2 >= 0) {
            nums1[mergedIdx] = nums2[idx2];
            idx2--;
            mergedIdx--;
        }
    }
}
