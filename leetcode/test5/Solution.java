package com.leetcode.test5;

/**
 * @Author: LiuHu
 * @Date: 2021/8/10 14:40
 * @Version 1.0
 */
public class Solution {
    public String longestPalindrome(String s) {
        int max =0;

        int left=0,right=1;
        //第一步打表
        int len=s.length();//  length()字符串的    length 数组的
        boolean [][] dp =new boolean[len][len];
        //对角线上的全是回文  以此作为母体发散
        for(int i=0;i<len;i++){
            dp[i][i]=true;
        }
        //babad
        for(int i=0;i<len;i++){
            for(int j=0;j<len-1 && j<i;j++){

                char a= s.charAt(i);
                char b= s.charAt(j);
                //括号打错地方了 服啦
                boolean ss=dp[i + 1][j - 1];

                //有个问题  在 i 的时候 i+1 还不知道咋办

                dp[i][j]= (s.charAt(i) == s.charAt(j)) && (j - i == 2 || j-i==1 || dp[i + 1][j - 1]);
                if(dp[i][j] && j-i>max){
                    left=i;
                    right=j+1;
                    //max要更新啊 我草
                    max=j-i;

                }
            }
        }

//        for(int i=0;i<len;i++){
//            for(int j=0;j<len;j++){
//
//                System.out.print(dp[i][j]+" ");
//                if(j==len-1){
//                    System.out.println();
//                }
//
//
//            }
//        }


        return s.substring(left,right);
    }

    public static void main(String[] args) {

        Solution a =new Solution();
        String aa=a.longestPalindrome("aaaa");
        System.out.println(aa);


    }


}
