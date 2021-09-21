package com.leetcode.test35;

/**
 * @Author: LiuHu
 * @Date: 2021/9/4 21:50
 * @Version 1.0
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int m=0;
        while(l<=r){
            m=(l+r)>>1;
            if(target==nums[m]){
                return m;
            }
            else if(target<nums[m]){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return target<nums[m]?(m):(m+1);
    }
}
