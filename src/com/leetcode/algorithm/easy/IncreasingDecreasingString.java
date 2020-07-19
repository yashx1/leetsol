package com.leetcode.algorithm.easy;

/**
 * reference : https://leetcode.com/problems/increasing-decreasing-string/
 */

public class IncreasingDecreasingString {

    public String sortString(String s) {
        int[] alphabetIndex = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0};

        for (char ch : s.toCharArray()) {
            int i = ((int) ch) % 97;
            alphabetIndex[i] = alphabetIndex[i] + 1;
        }
        String str = "";
        return increaseDecreaseString(s, str, alphabetIndex);
    }

    private String increaseDecreaseString(String input, String str, int[] alphabetIndex) {
        if (input.length() == str.length()) {
            return str;
        }

        for (int i = 0; i < alphabetIndex.length; i++) {
            if (alphabetIndex[i] != 0) {
                str = str + (char) (97 + i);
                alphabetIndex[i] = alphabetIndex[i] - 1;
            }
        }
        return increaseDecreaseStringReverse(input, str, alphabetIndex);
    }

    private String increaseDecreaseStringReverse(String input, String str, int[] alphabetIndex) {
        if (input.length() == str.length()) {
            return str;
        }

        for (int j = alphabetIndex.length - 1; j >= 0; j--) {
            if (alphabetIndex[j] != 0) {
                str = str + (char) (97 + j);
                alphabetIndex[j] = alphabetIndex[j] - 1;
            }
        }
        return increaseDecreaseString(input, str, alphabetIndex);
    }
}
/*
Runtime: 12 ms, faster than 30.50% of Java online submissions for Increasing Decreasing String.
Memory Usage: 39.9 MB, less than 31.76% of Java online submissions for Increasing Decreasing String.
 */