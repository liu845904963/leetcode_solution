package com.leetcode.test40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: LiuHu
 * @Date: 2021/9/6 16:24
 * @Version 1.0
 *
 *

 *
 *
 *
 */
public class Solution {

    List<Integer> path =new ArrayList<>();
    List<List<Integer>> res =new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(0,target,candidates);
        return res;

//        List<List<Integer>> rr=new ArrayList<>();
//        for (List<Integer> re : res) {
//            if(rr.contains(re))
//                continue;
//            rr.add(re);
//        }
//        return rr;
    }

    public void helper(int start, int target, int[] candidates) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;

        }
        for(int i =start ;i<candidates.length;i++)
        {
            if(i>start && candidates[i]==candidates[i-1])continue;  /*去重*/
//            if(target<candidates[i])break;
            path.add(candidates[i]);
            helper(i+1,target-candidates[i],candidates);
            path.remove(path.size()-1);
        }


    }
//    List<List<Integer>> list=new ArrayList<>();
//    List<Integer> path=new ArrayList<>();
//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        Arrays.sort(candidates);
//        dfs(candidates,target,0);
//        return list;
//    }
//    private void dfs(int[] candidates, int target,int index){
//        if(target==0){
//            list.add(new ArrayList<>(path));
//            return;
//        }
//        for(int i=index;i<candidates.length;i++){
//            if(candidates[i]<=target){
//                if(i>index&&candidates[i]==candidates[i-1]){
//                    continue;
//                }
//                path.add(candidates[i]);
//                dfs(candidates,target-candidates[i],i+1);
//                path.remove(path.size()-1);
//            }
//        }
//    }
    public static void main(String[] args) {
        Solution aa =new Solution();
        List<List<Integer>> lists = aa.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        System.out.println(lists);

    }
}