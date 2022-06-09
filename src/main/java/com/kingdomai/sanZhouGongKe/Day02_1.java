package com.kingdomai.sanZhouGongKe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day02_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int[] ints = twoSum(arr, 9);
        System.out.println(Arrays.toString(ints));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!(map.containsKey(target - nums[i]))){
                map.put(nums[i],i);
            }else {
                return new int[]{map.get(target - nums[i]),i};
            }
        }
        return new int[0];
    }
}
