package com.leetcode.test49;

import java.util.*;

/**
 * @Author: LiuHu
 * @Date: 2021/9/9 22:03
 * @Version 1.0
 */
public class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<Integer> index= new ArrayList<>();
        List<String> val= new ArrayList<>();
        HashSet<Integer> index2 =new HashSet<>();
        List<List<String>> res =new ArrayList<>();
        for (String str : strs) {
            int char_nums=0;
            for (char c : str.toCharArray()) {
                char_nums+=(c-'0');
            }

            index.add(char_nums);
            index2.add(char_nums);
            val.add(str);
        }
        System.out.println(index);
        for (Integer i : index2) {
            List<String> tt =new ArrayList<>();
            for(int j=0;j<index.size();j++){
                if(index.get(j).equals(i)){
                    tt.add(val.get(j));
                }
            }
            res.add(tt);
        }

            return  res;
    }
    public static void main(String[] args) {
        String []strs ={"eat", "tea", "tan", "eat", "nat", "bat"};
        String []strs1 ={"", ""};
//
//        System.out.println("tea".toCharArray());
//        System.out.println("".toCharArray());
//        System.out.println('a' - '0');
        Solution3 aa =new Solution3();
        System.out.println(aa.groupAnagrams(strs));
//        char []ll = "eat".toCharArray();
//        Arrays.sort(ll);
//        System.out.println(Arrays.toString(ll));
    }
}