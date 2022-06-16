package com.kingdomai.sanZhouGongKe;

import java.util.ArrayList;
import java.util.List;

public class Day10_3 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }

    public void inorder(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        inorder(root.right,res);
        inorder(root.left,res);
        res.add(root.val);
    }
}
