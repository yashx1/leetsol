package com.leetcode.algorithm.easy;

import org.junit.Assert;
import org.junit.Test;

public class HappyNumberTest {

    @Test
    public void isHappyTest() {
        HappyNumber happyNumber = new HappyNumber();
        Assert.assertEquals(happyNumber.isHappy(19), true);
        Assert.assertEquals(happyNumber.isHappy(2), false);
    }


    @Test
    public void squareSumTest() {
        HappyNumber happyNumber = new HappyNumber();
        Assert.assertEquals(happyNumber.squareSum(0), 0);
        Assert.assertEquals(happyNumber.squareSum(1), 1);
        Assert.assertEquals(happyNumber.squareSum(10), 1);
        Assert.assertEquals(happyNumber.squareSum(11), 2);
        Assert.assertEquals(happyNumber.squareSum(34), 25);
    }
}
