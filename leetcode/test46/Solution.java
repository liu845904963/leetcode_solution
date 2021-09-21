package com.leetcode.test46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: LiuHu
 * @Date: 2021/9/6 20:31
 * @Version 1.0
 * class Solution:
 *     def permute(self, nums: List[int]) -> List[List[int]]:
 *         res = []
 *         path = []
 *         def backtrack(nums):
 *             if len(path) == len(nums):
 *                 res.append(path[:])
 *                 return
 *             for i in range(0, len(nums)):
 *                 if nums[i] in path:
 *                     continue
 *                 path.append(nums[i])
 *                 backtrack(nums)
 *                 path.pop()
 *
 *         backtrack(nums)
 *         return res
 *
 *
 *
 *
 */
public class Solution {
    List<Integer>path =new ArrayList<>();
    List<List<Integer>>res=new ArrayList<>();


    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);

        helper(nums);
        return res;
    }
    public void helper(int []nums){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int num : nums) {
//            if (path.contains(num)) continue;
            path.add(num);
            helper(nums);
            path.remove(path.size() - 1);
        }

    }

    public static void main(String[] args) {
        int []nums ={1,2,3};
        Solution aa=new Solution();
        List<List<Integer>> list = aa.permute(nums);
        System.out.println(list);
    }
}
