package com.kingdomai.sanZhouGongKe;

public class Day11_3 {
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {
        boolean check = check(root.left, root.right);
        return check;
    }

    public static boolean check(TreeNode p,TreeNode q){
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        return p.val == q.val && check(p.left,q.right) && check(p.right,q.left);
    }
}
