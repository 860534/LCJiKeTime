package com.kingdomai.SanZhouGongKeJinJie;

public class Day01_1 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int i = singleNumber(nums);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
