package com.kingdomai.SanZhouGongKeJinJie;

import java.util.Arrays;

public class Day01_2 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int i = majorityElement(nums);
        System.out.println(i);
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
