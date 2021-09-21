package com.leetcode.test79;

import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: LiuHu
 * @Date: 2021/9/16 21:16
 * @Version 1.0
 */
class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n =sc.nextInt();
        int []A= new int[n];
        int []B= new int[n];
        for (int i = 0; i < n; i++) {
            A[i]=sc.nextInt();
            B[i]=-1;
        }
        int m =sc.nextInt();
        for (int i = 0; i < m; i++) {
            int op=sc.nextInt();
            if(op==1){

                int k =sc.nextInt();
                int x =sc.nextInt()-1;
                int y =sc.nextInt()-1;
                int ll=0;

                while(ll<=k){
                    B[y++]=A[x++];
                    ll++;
                    if(y>n-1)break;
                }

            }
            else{
                int query =sc.nextInt();
                System.out.println(B[query-1]);
            }

        }
    }
}
