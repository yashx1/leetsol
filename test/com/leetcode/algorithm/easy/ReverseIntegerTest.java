package com.leetcode.algorithm.easy;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void reverseTest1() {
        ReverseInteger reverseInteger = new ReverseInteger();
        Assert.assertEquals(321, reverseInteger.reverse(123));
    }

    @Test
    public void reverseTest2() {
        ReverseInteger reverseInteger = new ReverseInteger();
        Assert.assertEquals(-321, reverseInteger.reverse(-123));
    }

    @Test
    public void reverseTest3() {
        ReverseInteger reverseInteger = new ReverseInteger();
        Assert.assertEquals(21, reverseInteger.reverse(120));
    }

    @Test
    public void reverseTest4() {
        ReverseInteger reverseInteger = new ReverseInteger();
        Assert.assertEquals(0, reverseInteger.reverse(1534236469));
    }

}