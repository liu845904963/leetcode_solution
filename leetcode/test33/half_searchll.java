package com.leetcode.test33;

import java.lang.invoke.MutableCallSite;
import java.util.ConcurrentModificationException;

/**
 * @Author: LiuHu
 * @Date: 2021/9/3 20:17
 * @Version 1.0
 */

 //[4,5,6,7,0,1,2]


    //>>2  这是除以4 我天
    //>>1  这才是除以2啊
public class half_searchll{
    public int half_search2(int[] nums, int target) {
        //移动右边界
        int l=0,r=nums.length-1;
        int m;
        while(l<=r){
            m=(l+r)>>1;
            if(target<nums[m]){
                r=m-1;

            }
            else{
                l=m+1;
            }
            if(target==nums[m]){
                return m;
            }
        }
        return -1;
//        int lo = 0, hi = nums.length - 1, mid = 0;
//        while (lo <= hi) {
//            mid = lo + ((hi - lo) >> 1);//很关键
//            if (nums[mid] == target) {
//                return mid;
//            }
//            if (nums[mid] < target) {
//                lo = mid + 1;
//            } else {
//                hi = mid - 1;
//            }
//        }
//        return -1;


}
int half_search(int[] nums,int target) {
    int l = 0, r = nums.length - 1;
    int m = (l + r) / 2;
    while (l < r) {//二分终止条件


        if (target < nums[m]) {
            m = (l + m-1) / 2;
        }
        else if (target > nums[m]) {
            m = (m + r+1) / 2;
        }
//        if (m == 0) {
//            return m;
//        }
//        if (m == nums.length - 2) {
//            return m+1;
//        }
        if (target == nums[m]) {
            return m;
        }



        /*这样写二分 边界条件很复杂  当查找元素正好在两端的时候
        （l+m）>>2 会一直卡在0出  m+r会一直卡在len-2(两种方法 要么分别判断太笨 ，直接中间值-1 +1)
         >>2是除以4  老是记不住
        */


    }
    return -1;

}

public static void main(String[] args) {

        half_searchll a=new half_searchll();
        int aa=a.half_search(new int[]{1,2,11,12,13,19},19);
        System.out.println(aa);
        System.out.println((2) >> 2);

    }
}
