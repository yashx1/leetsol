package com.leetcode.algorithm.easy;

/**
 * reference : https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
 **/
public class SortBy1Bits {

    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (compute1Bit(Integer.toBinaryString(arr[j]).toCharArray()) > compute1Bit(Integer.toBinaryString(arr[j + 1]).toCharArray())) {
                    swap(arr, j);
                } else if (compute1Bit(Integer.toBinaryString(arr[j]).toCharArray()) == compute1Bit(Integer.toBinaryString(arr[j + 1]).toCharArray())) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j);
                    }
                }
            }
        }
        return arr;
    }

    private int compute1Bit(char[] charArr) {
        int res = 0;
        for (char c : charArr) {
            if (c == '1') {
                res++;
            }
        }
        return res;
    }

    void swap(int[] arr, int j) {
        int tmp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = tmp;
    }

}
/*
Runtime: 1771 ms, faster than 5.01% of Java online submissions for Sort Integers by The Number of 1 Bits.
Memory Usage: 40.2 MB, less than 14.07% of Java online submissions for Sort Integers by The Number of 1 Bits.
*/