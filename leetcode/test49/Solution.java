package com.leetcode.test49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: LiuHu
 * @Date: 2021/9/9 21:17
 * @Version 1.0
 *
 *
 * 假如出现一样的字符串 map就不行了
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,Integer> finder =new HashMap<>();
        HashSet<Integer> val =new HashSet<>();
        List<List<String>> res =new ArrayList<>();
        for (String str : strs) {
            int char_sum=0;
            if(str.equals("")){
                finder.put(str,0);
                continue;
            }
            for (char c : str.toCharArray()) {
                char_sum+=c-'0';
            }
            finder.put(str,char_sum);
            val.add(char_sum);
            System.out.println(finder);
            System.out.println(val);
        }
        for (Integer t : val) {
            List<String> temp =new ArrayList<>();
            for (String s : finder.keySet()) {
                if (finder.get(s).equals(t)){
                    temp.add(s);

                }
            }
            res.add(temp);

        }

        return res;
    }

//    public static void main(String[] args) {
//        String []strs ={"eat", "tea", "tan", "eat", "nat", "bat"};
//        String []strs1 ={"", ""};
//
//        System.out.println("tea".toCharArray());
//        System.out.println("".toCharArray());
//        System.out.println('a' - '0');
//        Solution aa =new Solution();
//        System.out.println(aa.groupAnagrams(strs));
//    }

}
