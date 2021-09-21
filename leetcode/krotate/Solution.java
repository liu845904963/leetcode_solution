package com.leetcode.krotate;

import java.util.Arrays;

/**
 * @Author: LiuHu
 * @Date: 2021/9/9 20:08
 * @Version 1.0
 */
/*
*
* 将前K个数移动到末尾
*1, 2, 3, 4, 5, 6, 7

前 k 个原地翻转：
3, 2, 1, 4, 5, 6, 7

后 n - k 个原地翻转：
3, 2, 1, 7, 6, 5, 4

整体原地翻转：
4, 5, 6, 7, 1, 2, 3

*
* */
public class Solution {
    public void rotate(int []nums,int k){
        int n=nums.length;
        reversal(nums,0,k);
        reversal(nums,k,n);
        reversal(nums,0,n);

    }
    public void reversal(int[] nums,int start,int end){
        int temp=0;
        for(int i=start;i<(end+start)/2;i++){//两点中点坐标

            temp=nums[i];
            nums[i]=nums[end+start-i-1];
            nums[end+start-i-1]=temp;
        }

    }


    public static void main(String[] args) {
        int []nums ={1,2,3,4,5,6,7};
        Solution aa=new Solution();
        aa.rotate(nums,3);
        for (int i : nums) {
            System.out.println(i);
        }
        System.out.println((92+81+90+84+86+84+91+72+81+97+89+92+78+87)/14);
    }
}
