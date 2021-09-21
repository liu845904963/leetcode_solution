package com.leetcode.test5;

/**
 * @Author: LiuHu
 * @Date: 2021/8/10 15:48
 * @Version 1.0
 */
public class Solution2 {
    public String longestPalindrome(String s) {

        int maxlen=0;
        int start=0;
        int len =s.length();
        boolean [][]dp =new boolean[len][len];
        for(int i=0;i<len;i++){
            dp[i][i]=true;
        }
        for(int j =1;j<len;j++){
            for(int i=0;i<j&&i<len-1;i++){
                if(s.charAt(i)==s.charAt(j) && (j-i==1||j-i==2||dp[i+1][j-1])){
                    dp[i][j]=true;
                    if(j-i>maxlen){
                        maxlen=j-i;
                        start=i;
                    }
                }
                else{
                    dp[i][j]=false;
                }

            }
        }

        return s.substring(start,start+maxlen+1);
    }

    public static void main(String[] args) {
        Solution2 b=new Solution2();
        String aaaa = b.longestPalindrome("aaaa");
        System.out.println(aaaa);
    }

}
