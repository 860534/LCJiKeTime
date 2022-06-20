package com.kingdomai.sanZhouGongKe;

public class Day13_1 {
    public static void main(String[] args) {
        TreeNode treeNode4 = new TreeNode(1,null,null);
        TreeNode treeNode5 = new TreeNode(3,null,null);
        TreeNode treeNode2 = new TreeNode(2,treeNode4,treeNode5);
        TreeNode treeNode3 = new TreeNode(7,null,null);
        TreeNode treeNode = new TreeNode(4,treeNode2,treeNode3);
        TreeNode treeNode1 = searchBST(treeNode, 2);


    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null){
            return null;
        }
        if (root.val == val){
            return root;
        }
        return searchBST(val < root.val ? root.left : root.right,val);
    }
}
