package com.leetcode.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * reference : https://leetcode.com/problems/contains-duplicate/
 **/
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Map map = new HashMap();
        boolean res = false;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                res = true;
                break;
            } else {
                map.put(nums[i], 0);
            }
        }
        return res;
    }
}
/*
Runtime: 7 ms, faster than 43.63% of Java online submissions for Contains Duplicate.
Memory Usage: 45.4 MB, less than 60.42% of Java online submissions for Contains Duplicate.
 */