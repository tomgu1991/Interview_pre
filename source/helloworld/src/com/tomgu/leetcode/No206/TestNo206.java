package com.tomgu.leetcode.No206;

public class TestNo206 {

  public static void main(String[] args) {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(3);
    ListNode a4 = new ListNode(4);
    ListNode a5 = new ListNode(5);
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    a4.next = a5;
    Solution206 s = new Solution206();
    System.out.println(s.reverseList(a4));
  }
}
