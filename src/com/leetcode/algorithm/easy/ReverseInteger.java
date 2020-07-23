package com.leetcode.algorithm.easy;

/**
 * reference : https://leetcode.com/problems/reverse-integer
 **/
public class ReverseInteger {

    public int reverse(int x) {
        boolean isPositive = true;
        int res = 0;
        if (x < 0) {
            isPositive = false;
        }

        if (!isPositive) {
            x = x * (-1);
        }

        while (x > 0) {
            int i = x % 10;
            x = x / 10;

            if ((res * 10) / 10 != res) {
                return 0;
            }
            res = res * 10 + i;
        }

        if (!isPositive) {
            res = res * (-1);
        }

        return res;
    }
}
/*
Runtime: 2 ms, faster than 45.33% of Java online submissions for Reverse Integer.
Memory Usage: 38.5 MB, less than 5.03% of Java online submissions for Reverse Integer.
 */