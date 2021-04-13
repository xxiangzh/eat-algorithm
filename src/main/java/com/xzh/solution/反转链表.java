package com.xzh.solution;

import com.xzh.model.ListNode;

/**
 * @author 向振华
 * @date 2021/04/01 15:00
 */
public class 反转链表 {

    /**
     * 递归反转
     *
     * @param head
     * @return
     */
    public static ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
