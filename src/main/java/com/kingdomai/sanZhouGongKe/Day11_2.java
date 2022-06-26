package com.kingdomai.sanZhouGongKe;

public class Day11_2 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(15,null,null);
        TreeNode treeNode2 = new TreeNode(7,null,null);
        TreeNode treeNode3 = new TreeNode(20,treeNode1,treeNode2);
        TreeNode treeNode4 = new TreeNode(9,null,null);
        TreeNode treeNode5 = new TreeNode(3,treeNode4,treeNode3);
        int i = maxDepth(treeNode5);
        System.out.println(i);
    }

    public static int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight,rightHeight) + 1;
        }
    }
}
