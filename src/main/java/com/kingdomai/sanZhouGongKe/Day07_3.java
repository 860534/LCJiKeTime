package com.kingdomai;

public class Day07_3 {
    public static void main(String[] args) {
        ListNode listNode6 = new ListNode(6,null);
        ListNode listNode5 = new ListNode(5,listNode6);
        ListNode listNode4 = new ListNode(4,listNode5);
        ListNode listNode3 = new ListNode(6,listNode4);
        ListNode listNode2 = new ListNode(2,listNode3);
        ListNode listNode1 = new ListNode(1,listNode2);
        ListNode listNode = removeElements(listNode1, 6);
        System.out.println(listNode.toString());

    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return head;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
        //else if(head.val == val){
        //    removeElements(head.next.next,val);
        //}else {
        //    removeElements(head.next,val);
        //}
        //return null;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val,ListNode next){this.val = val; this.next = next;}

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
