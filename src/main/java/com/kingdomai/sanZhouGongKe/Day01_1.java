package com.kingdomai.sanZhouGongKe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Day01_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(getRepetition(arr));
    }

    public static boolean getRepetition(int[] nums){
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(!(map.containsKey(arr[i]))){
//                map.put(arr[i],0);
//            }else {
//                return true;
//            }
//        }
//        return false;
    }
}
