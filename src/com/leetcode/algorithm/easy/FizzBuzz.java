package com.leetcode.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
* reference : https://leetcode.com/problems/fizz-buzz
**/
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List list =  new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            String res = "";

            if (i%3 == 0){
                res = "Fizz";
            }

            if (i%5 == 0){
                res += "Buzz";
            }

            if (res.isEmpty()){
                res = String.valueOf(i);
            }
            list.add(res);
        }
        return list;
    }
}
/*
Runtime: 5 ms, faster than 26.63% of Java online submissions for Fizz Buzz.
Memory Usage: 45.9 MB, less than 5.03% of Java online submissions for Fizz Buzz.
*/
