package com.leetcode.test78;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: LiuHu
 * @Date: 2021/9/16 19:05
 * @Version 1.0
 */
public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res =new ArrayList<>();
        List<Integer> path =new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                ArrayList<Integer> temp = new ArrayList<>(res.get(j));
                temp.add(nums[i]);
                res.add(temp);


            }

        }

        return res;
    }

    public static void main(String[] args) {
        Solution aa =new Solution();
        int []aaa ={1,2,3};
        System.out.println(aa.subsets(aaa));

    }
}
