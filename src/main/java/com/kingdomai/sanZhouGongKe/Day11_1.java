package com.kingdomai.sanZhouGongKe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Day11_1 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null){
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int currentLevelSize = queue.size();
            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ret.add(level);
        }
        return ret;

        //return null;
        //List<List<TreeNode>> list = new ArrayList<>();
        //List<List<Integer>> list1 = new ArrayList<>();
        //List<TreeNode> rootList = new ArrayList<>(Arrays.asList(root));
        //getValues(rootList,list);
        //for (List<TreeNode> treeNodes : list) {
        //    ArrayList<Integer> arrayList = new ArrayList<>();
        //    for (TreeNode treeNode : treeNodes) {
        //        arrayList.add(treeNode.val);
        //    }
        //    list1.add(arrayList);
        //}
        //return list1;
    }

    //public void getValues(List<TreeNode> list,List<List<TreeNode>> listValues){
    //    List<TreeNode> arrayList = new ArrayList<>();
    //    for (TreeNode treeNode : list) {
    //        if(treeNode.left != null){
    //            arrayList.add(treeNode.left);
    //        }else if (treeNode.right != null){
    //            arrayList.add(treeNode.right);
    //        }
    //    }
    //    if (arrayList.size() > 0){
    //        listValues.add(arrayList);
    //        getValues(arrayList,listValues);
    //    }
    //}
}
