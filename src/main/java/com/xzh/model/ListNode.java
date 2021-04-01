package com.xzh.model;

/**
 * 单向链表
 *
 * @author 向振华
 * @date 2021/04/01 09:15
 */
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
