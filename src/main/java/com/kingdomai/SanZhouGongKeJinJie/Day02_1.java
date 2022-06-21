package com.kingdomai.SanZhouGongKeJinJie;

import java.util.Arrays;

public class Day02_1 {
    public static void main(String[] args) {
//        int[] nums = {2,0,2,1,1,0};
        int[] nums = {1,2,0};
//        int[] nums = {2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int min = 0;
        int max = nums.length - 1;
        for (int i = 0; i <= max; i++) {
            if (i <= max &&nums[i] == 2){
//                int temp = nums[i];
                nums[i] = nums[max];
                nums[max] = 2;
                max--;
            }
            if (nums[i] == 0){
//                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = 0;
                min++;
            }
        }
    }
}
