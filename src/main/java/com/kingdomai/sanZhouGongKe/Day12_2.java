package com.kingdomai.sanZhouGongKe;

import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;

public class Day12_2 {
    public static void main(String[] args) {
        Queue<Integer> queVal = new LinkedList<>();
        queVal.offer(1);
        queVal.offer(2);
        queVal.offer(3);
        Integer peek = queVal.peek();
        System.out.println(peek);
        Integer poll = queVal.poll();
        System.out.println(poll);
        System.out.println(queVal);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> queNode = new LinkedList<>();
        Queue<Integer> queVal = new LinkedList<>();
        queNode.offer(root);
        queVal.offer(root.val);
        while (!queNode.isEmpty()){
            TreeNode now = queNode.poll();
            int temp = queVal.poll();
            if (now.left == null && now.right == null){
                if (temp == targetSum){
                    return true;
                }
                continue;
            }
            if (now.left != null){
                queNode.offer(now.left);
                queVal.offer(now.left.val + temp);
            }
            if (now.right != null){
                queNode.offer(now.right);
                queVal.offer(now.right.val + temp);
            }
        }
        return false;
    }

}
