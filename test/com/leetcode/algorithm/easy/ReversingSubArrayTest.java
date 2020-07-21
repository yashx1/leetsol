package com.leetcode.algorithm.easy;

import org.junit.Assert;
import org.junit.Test;

public class ReversingSubArrayTest {

    @Test
    public void canBeEqual() {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 4, 1, 3};

        ReversingSubArray reversingSubArray = new ReversingSubArray();
        Assert.assertTrue(reversingSubArray.canBeEqual(a, b));
    }
}