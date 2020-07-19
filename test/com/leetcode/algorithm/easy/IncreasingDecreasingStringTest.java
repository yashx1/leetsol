package com.leetcode.algorithm.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * reference : https://leetcode.com/problems/increasing-decreasing-string/
 */

public class IncreasingDecreasingStringTest {

    @Test
    public void sortStringTest1() {
        IncreasingDecreasingString increasingDecreasingString = new IncreasingDecreasingString();
        Assert.assertEquals(increasingDecreasingString.sortString("aaaabbbbcccc"), "abccbaabccba");
    }

    @Test
    public void sortStringTest2() {
        IncreasingDecreasingString increasingDecreasingString = new IncreasingDecreasingString();
        Assert.assertEquals(increasingDecreasingString.sortString("rat"), "art");
    }

    @Test
    public void sortStringTest3() {
        IncreasingDecreasingString increasingDecreasingString = new IncreasingDecreasingString();
        Assert.assertEquals(increasingDecreasingString.sortString("leetcode"), "cdelotee");
    }

    @Test
    public void sortStringTest4() {
        IncreasingDecreasingString increasingDecreasingString = new IncreasingDecreasingString();
        Assert.assertEquals(increasingDecreasingString.sortString("ggggggg"), "ggggggg");
    }

    @Test
    public void sortStringTest5() {
        IncreasingDecreasingString increasingDecreasingString = new IncreasingDecreasingString();
        Assert.assertEquals(increasingDecreasingString.sortString("spo"), "ops");
    }

}
