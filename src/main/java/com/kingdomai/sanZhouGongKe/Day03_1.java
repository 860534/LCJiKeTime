package com.kingdomai.sanZhouGongKe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Day03_1 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        int[] intersect = intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersect));
    }

    /**
     * 遍历小的数组转map，减小空间复杂度
     * arrayList转int数组，用循环，直接转只能转为integer
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            intersect(nums2,nums1);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if(!(map.containsKey(nums1[i]))){
                map.put(nums1[i],1);
            }else {
                int count = map.get(nums1[i]);
                map.put(nums1[i],count + 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) != 0){
                arrayList.add(nums2[i]);
                int count = map.get(nums2[i]);
                map.put(nums2[i],count - 1);
            }
        }
        Object[] objects = arrayList.toArray();
        int[] arr = new int[objects.length];
        for (int i = 0; i < objects.length; i++) {
            arr[i] = (int)objects[i];
        }

        return arr;
    }
}
