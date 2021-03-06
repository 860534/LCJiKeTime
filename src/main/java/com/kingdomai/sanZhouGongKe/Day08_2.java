package com.kingdomai.sanZhouGongKe;

public class Day08_2 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,null);
        Class<? extends ListNode> aClass = listNode.getClass();
//        aClass.

    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode cur = head;
        while (cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }

        return head;
    }



    public static class ListNode {
        int val;
        ListNode next;

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
}
