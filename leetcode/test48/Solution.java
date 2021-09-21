package com.leetcode.test48;

/**
 * @Author: LiuHu
 * @Date: 2021/9/9 17:04
 * @Version 1.0
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n-1; i++) {
            for(int j=i;j<n;j++){
                swap(i,j,j,i,matrix);
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {

                swap(i,j,i,n-j-1,matrix);


            }
        }

    }

    public void swap(int i, int j,int i1,int j1,int [][]matrix) {
        int temp = 0;
        temp = matrix[i][j];
        matrix[i][j] = matrix[i1][j1];
        matrix[i1][j1] = temp;

    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Solution aa = new Solution();
        aa.rotate(matrix);
        int n = matrix.length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matrix[i][j]);
                if(j==matrix.length-1) System.out.println();

            }
        }
    }
}