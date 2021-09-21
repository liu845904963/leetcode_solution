package com.leetcode.test56;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;

/**
 * @Author: LiuHu
 * @Date: 2021/9/15 9:05
 * @Version 1.0
 */
public class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(v1,v2)->(v1[0]-v2[0]));
        int idx =-1;
        int [][]res =new int [intervals.length][2];
        for (int[] interval : intervals) {
            //要给res赋初值  怎么赋值呢？在外面的话 又要写一个 可以写个index=-1
            if(idx==-1 || res[idx][1]<interval[0]){
                res[++idx]=interval;
            }
            else{
                res[idx][1]=Math.max(res[idx][1],interval[1]);
            }

        }

        return Arrays.copyOf(res,idx+1);
    }

    public static void main(String[] args) {

        int [][]a = {{1,3}, {2,6},{8,10},{15,18}};


    }
}
