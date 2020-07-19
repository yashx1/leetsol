package com.leetcode.algorithm.easy;

/**
 * reference : https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
 */

public class OddCounts {
    public String generateTheString(int n) {
        String s = "";
        if (n % 2 == 1) {
            return createString(n);
        }
        return createString(n - 1) + "y";
    }

    public String createString(int a) {
        if (a == 1) {
            return "x";
        }
        return "x" + createString(a - 1);
    }
}
/*
Runtime: 12 ms, faster than 5.44% of Java online submissions for Generate a String With Characters That Have Odd Counts.
Memory Usage: 42.9 MB, less than 5.09% of Java online submissions for Generate a String With Characters That Have Odd Counts.
 */