package com.kingdomai.SanZhouGongKeJinJie;

public class Day04_1 {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {

        return true;
    }

    public int search(int[] nums, int target) {
        int low =1;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
