package com.leetcode.test39;

import com.cqupt.adaptor.adptor_using_weituo.Print;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

/**
 * @Author: LiuHu
 * @Date: 2021/9/5 11:31
 * @Version 1.0
 *
 *
 * 输入: candidates = [2,3,6,7], target = 7
 * 输出: [[7],[2,2,3]]
 *
 *
 * 输入: candidates = [2,3,5], target = 8
 * 输出: [[2,2,2,2],[2,3,3],[3,5]]
 *
 *  * result = []
 *  * def backtrack(路径, 选择列表):
 *  *     if 满足结束条件:
 *  *         result.add(路径)
 *  *         return
 *  *
 *  *     for 选择 in 选择列表:
 *  *         做选择
 *  *         backtrack(路径, 选择列表)
 *  *         撤销选择
 *
 *
 *
 *
 */
/*回溯要点： 深拷贝，返回条件的前一步要添加路径   按照上面的做法就能出一个全排列
*
* 不加 约束条件就是 完全书 按照左中右遍历
*
*  */


public class Solution {


    List<Integer> path =new ArrayList<>();
    List<List<Integer>> res =new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(0,target,candidates);
        return res;


    }
    public void helper(int start,int target,int []candidates){

        if(target==0){
            res.add(new ArrayList<>(path));    /* 深拷贝 */
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]>target)break;
            path.add(candidates[i]);
            helper(i,target-candidates[i],candidates);
            path.remove(path.size()-1);

        }

    }

    public static void main(String[] args) {
        int []candidates={3,2,6,7};
        int target=7;
        Solution aa=new Solution();
        List<List<Integer>> lists = aa.combinationSum(candidates,target);
        for (List<Integer> list : lists) {
            System.out.println(list);

        }




    }

}
