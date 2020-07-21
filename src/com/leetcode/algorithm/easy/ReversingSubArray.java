package com.leetcode.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * reference : https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 **/
public class ReversingSubArray {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target[i]) {
                //do nothing
            } else {
                if (map.containsKey(arr[i])) {
                    map.remove(arr[i]);
                } else {
                    map.put(arr[i], 0);
                }

                if (map.containsKey(target[i])) {
                    map.remove(target[i]);
                } else {
                    map.put(target[i], 0);
                }
            }
        }

        return map.isEmpty();
    }
}
/*
Runtime: 5 ms, faster than 41.98% of Java online submissions for Make Two Arrays Equal by Reversing Sub-arrays.
Memory Usage: 39.5 MB, less than 60.62% of Java online submissions for Make Two Arrays Equal by Reversing Sub-arrays.
 */