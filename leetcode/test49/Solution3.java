package com.leetcode.test49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: LiuHu
 * @Date: 2021/9/11 21:49
 * @Version 1.0
 */
public class Solution3 {
    public List<List<String>> groupAnagrams(String[] strs) {


        HashSet<String> val =new HashSet<>();
        List<String>  key =new ArrayList<>();
        List<String>  value =new ArrayList<>();
        List<List<String>> res  =new ArrayList<>();
        for (String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            key.add(str);
            String aa =Arrays.toString(chars);
            value.add(aa);
            val.add(aa);
        }
        for (String s : val) {
            List<String> temp =new ArrayList<>();
            for(int j=0;j<value.size();j++){
                if(value.get(j).equals(s)){
                    temp.add(key.get(j));
                }
            }

            res.add(temp);
        }
        return res;

    }
}
class Solution4 {
    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> {
                    // 返回 str 排序后的结果。
                    // 按排序后的结果来grouping by，算子类似于 sql 里的 group by。
                    char[] array = str.toCharArray();
                    Arrays.sort(array);
                    return new String(array);
                })).values());
    }
}

