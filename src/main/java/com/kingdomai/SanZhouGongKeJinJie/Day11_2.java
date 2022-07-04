package com.kingdomai.SanZhouGongKeJinJie;

public class Day11_2 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode newHead = dummy;
        while (newHead.next != null && newHead.next.next != null) {
            if (newHead.next.val == newHead.next.next.val) {
                int x = newHead.next.val;
                while (newHead.next != null && newHead.next.val == x) {
                    newHead.next = newHead.next.next;
                }
            } else {
                newHead = newHead.next;
            }
        }
        return dummy.next;
//        ListNode listNode = head;
//        Boolean isRepetition = false;
//        while (head.next != null) {
//            if (head.val == head.next.val) {
//                head.next = head.next.next;
//                isRepetition = true;
//            } else {
//
//            }
//        }

    }
}
