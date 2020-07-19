package com.leetcode.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * reference : https://leetcode.com/problems/happy-number/
 **/
public class HappyNumber {
    public boolean isHappy(int n) {
        Map map = new HashMap<Integer, Integer>();
        return findHappiness(n, map);
    }

    private boolean findHappiness(int n, Map map) {
        if (map.containsKey(n)) {
            return false;
        } else {
            map.put(n, 0);
            if (n == 1) {
                return true;
            } else {
                return findHappiness(squareSum(n), map);
            }
        }
    }

    public int squareSum(int num) {
        if (num == 0) {
            return 0;
        }
        int res = num % 10;
        num = num / 10;
        return (res * res) + squareSum(num);
    }
}
/*
Runtime: 1 ms, faster than 91.02% of Java online submissions for Happy Number.
Memory Usage: 36.7 MB, less than 44.21% of Java online submissions for Happy Number.
*/