package com.leetcode.test47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: LiuHu
 * @Date: 2021/9/7 20:19
 * @Version 1.0
 */
public class Solution {
    List<List<Integer>> res =new ArrayList<>();
    List<Integer> path =new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int []visited =new int[nums.length];
        helper(nums,visited);
        return res;
    }
    public void helper(int []nums,int []visited){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        System.out.print("down:");
        for (int i1 : visited) {
            System.out.print(i1);

        }
        System.out.println();

        for(int i=0;i<nums.length;i++){
            if(visited[i]==1)continue;
            if(i>0&&nums[i]==nums[i-1]&&visited[i-1]==1)continue;
            visited[i]=1;
            path.add(nums[i]);
            helper(nums,visited);   /*达到返回条件后，最后一个helper返回上一个helper的入口执行直到全部完成*/
            visited[i]=0;
            System.out.print("up:"+i+" ");
            for (int i1 : visited) {
                System.out.print(i1);

            }
            System.out.println();

            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution aa =new Solution();
        List<List<Integer>> lists = aa.permuteUnique(new int[]{1,1, 2});
        System.out.println(lists);

    }


}
