package com.kingdomai.sanZhouGongKe;

import java.util.Arrays;

public class Day04_1 {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int[][] ints = matrixReshape(mat, 1, 4);
        System.out.println(Arrays.deepToString(ints));
//        System.out.println(Arrays.toString(ints));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m * n != r * c){
            return mat;
        }
        int[][] arr = new int[r][c];
        for (int i = 0; i < (m * n); i++) {
            arr[i / c][i % c] = mat[i / n][i % n];
        }
        return arr;
    }
}
