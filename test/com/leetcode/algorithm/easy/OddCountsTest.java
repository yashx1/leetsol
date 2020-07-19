package com.leetcode.algorithm.easy;

import org.junit.Assert;
import org.junit.Test;

public class OddCountsTest {

    @Test
    public void generateTheStringTest() {
        OddCounts oddCounts = new OddCounts();
        Assert.assertEquals(oddCounts.generateTheString(4), "xxxy");
    }
}
