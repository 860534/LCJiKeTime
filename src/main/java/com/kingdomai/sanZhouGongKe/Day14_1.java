package com.kingdomai.sanZhouGongKe;

public class Day14_1 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MIN_VALUE);
    }
    public static boolean isValidBST(TreeNode node,long lower, long upper){
        if (node == null){
            return true;
        }
        if (node.val <= lower || node.val >= upper){
            return false;
        }
        return isValidBST(node.left,lower,node.val)
                && isValidBST(node.right,node.val,upper);
    }
}
