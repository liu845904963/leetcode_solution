package com.leetcode.test20;

import java.util.Stack;

/**
 * @Author: LiuHu
 * @Date: 2021/8/19 21:19
 * @Version 1.0
 */
public class Solution {


    public boolean isValid(String s) {
        Stack<Character> res=new Stack<>();



        for(int i=1;i<s.length();i++){
            if(res.isEmpty()){
                res.push(s.charAt(i));
            }
            if((res.peek()=='{' && s.charAt(i)=='}')||
               (res.peek()=='(' && s.charAt(i)==')')||
               (res.peek()=='[' && s.charAt(i)==']')){
                res.pop();

            }
            else{
                res.push(s.charAt(i));
            }


        }

        return res.isEmpty();

    }

    public static void main(String[] args) {
        Solution a =new Solution();
        boolean valid = a.isValid("())");
        System.out.println(valid);
    }
}
