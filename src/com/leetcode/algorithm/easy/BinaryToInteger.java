package com.leetcode.algorithm.easy;

/**
 * reference : https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */

import com.leetcode.util.ListNode;

public class BinaryToInteger {
    public int getDecimalValue(ListNode head) {
        int i = 0;
        ListNode p = head;
        while(head.getNext() != null){
            i++;
            head = head.getNext();
        }

        head  = p;
        int base10 = 0;
        while(head != null){
            base10 = base10 + (head.getVal() * calcBase10(i));
            i--;
            head = head.getNext();
        }
        return base10;
    }

    private int calcBase10(int n){
        if(n == 0){
            return 1;
        }
        return 2*calcBase10(n-1);
    }
}

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
Memory Usage: 37.1 MB, less than 49.37% of Java online submissions for Convert Binary Number in a Linked List to Integer.
 */