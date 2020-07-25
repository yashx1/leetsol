package com.leetcode.algorithm.easy;

import org.junit.Assert;
import org.junit.Test;

public class SortBy1BitsTest {

    @Test
    public void sortByBitsTest1() {
        SortBy1Bits sortBy1Bits = new SortBy1Bits();
        int[] actualInput = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedOutput = {0, 1, 2, 4, 8, 3, 5, 6, 7};
        Assert.assertArrayEquals(expectedOutput, sortBy1Bits.sortByBits(actualInput));
    }

    @Test
    public void sortByBitsTest2() {
        SortBy1Bits sortBy1Bits = new SortBy1Bits();
        int[] actualInput = {10000, 10000};
        int[] expectedOutput = {10000, 10000};
        Assert.assertArrayEquals(expectedOutput, sortBy1Bits.sortByBits(actualInput));
    }


}