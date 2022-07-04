package com.kingdomai.SanZhouGongKeJinJie;

import java.util.HashMap;
import java.util.HashSet;

public class Day11_1 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode tempA = headA;
        while (tempA != null){
            set.add(tempA);
            tempA = tempA.next;
        }
        ListNode tempB = headB;
        while (tempB != null){
            if (set.contains(tempB)){
                return tempB;
            }
            tempB = tempB.next;
        }
        return null;
    }
}
