package com.kingdomai.SanZhouGongKeJinJie;

public class Day03_3 {


    public int[][] generateMatrix(int n) {
        int begin = 1;
        int end = n * n;
        int row = 0;
        int col = 0;
        int[][] arr = new int[][]{};
        for (int i = 0; i < end; i++) {
            if (begin <= n) {
                arr[row][col] = i;
                col++;
            }
        }
        return null;
    }
}
