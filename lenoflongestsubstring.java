package com.leetcode.test3;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: LiuHu
 * @Date: 2021/8/1 23:52
 * @Version 1.0
 *
 *
 * 用时 5%  内存12%
 *
 * 这个题 坑点好多 一次想清楚还挺难的
 * 首先是 出现重复的时候 得记住上一个字母的位置 +1
 * 第二判断是否是最大长度时 有两种情况 一种是一次性走完没重复的 需要和maxlen 作比较
 * 然后就是 出现重复字母的时候  要记录这个结束的时候是不是比maxlen大 如果是更新 然后在清空从重复字母下一个开始继续
 *     特别注意的是 重复了一定要清空数据 而不是放在 那个（麻了= =！！）
 *
 *
 */
public class lenoflongestsubstring {
    public int lenghtOfLongestSubstring(String s){
        int maxlen=0;
        int i=0;
        if(s.length()==1){
            return 1;
        }
        ArrayList<Character> res=new ArrayList<>();
        HashMap<Character,Integer> pos=new HashMap<>();

        while (i<(s.length())){
            if (res.contains(s.charAt(i))){
                if(res.size()>=maxlen){
                    maxlen=res.size();
                }
                res.clear();
                i= pos.get(s.charAt(i));
            }
        pos.put(s.charAt(i),i+1);
        res.add(s.charAt(i));

        i++;

        }
        return Math.max(maxlen, res.size());
    }

    public static void main(String[] args) {


//        Scanner scanner =new Scanner(System.in);
//        String input = scanner.nextLine();

        lenoflongestsubstring a =new lenoflongestsubstring();

        System.out.println(a.lenghtOfLongestSubstring("ggububgvfk"));
    }
}
