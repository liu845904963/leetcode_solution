package com.leetcode.test75;

/**
 * @Author: LiuHu
 * @Date: 2021/9/16 16:06
 * @Version 1.0
 */
public class Solution {
    public void sortColors(int[] nums) {
        /*输入：nums = [2,0,2,1,1,0]
        输出：[0,0,1,1,2,2]*/

        int l=0;
        int m=0;
        int r=nums.length-1;
        for(int i=0;i<nums.length&&i <=r;i++){

            if(nums[i]==0){
                swap(l,i,nums);
                l++;
            }

            else if(nums[i]==2){
                swap(r,i,nums);
                r--;
            }
        }


    }
    public void swap(int i,int j,int []nums){
        int temp=0;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
