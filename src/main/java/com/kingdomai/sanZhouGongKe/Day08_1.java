package com.kingdomai.sanZhouGongKe;

public class Day08_1 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }

        //ListNode cur = head;
        //if (cur.next != null)
        return null;
    }












    public static class ListNode{
        int val;
        com.kingdomai.Day07_3.ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, com.kingdomai.Day07_3.ListNode next){this.val = val; this.next = next;}

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
