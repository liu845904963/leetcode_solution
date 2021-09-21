package com.leetcode.test23;

import javax.swing.text.rtf.RTFEditorKit;
import java.util.List;

/**
 * @Author: LiuHu
 * @Date: 2021/9/2 14:26
 * @Version 1.0
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//1->4->5,
//1->3->4,
//2->6
//1->1->2->3->4->4->5->6
//k=3


// new ListNode()   不代表null

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    ListNode res =null;
    for (ListNode list : lists) {
        if(list==null){
            continue;
        }
        res=merge_two_list(res,list);


    }

    return res;

    }
    public ListNode merge_two_list(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;
        }
        else if(l1.val<l2.val){
            l1.next=merge_two_list(l1.next,l2);
            return l1;
        }
        else {
            l2.next=merge_two_list(l1,l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        ListNode []lists=new ListNode[]{
//                new ListNode(1,new ListNode(4,new ListNode(5))),
//                new ListNode(1,new ListNode(3,new ListNode(4))),
//                new ListNode(2,new ListNode(6))
                new ListNode(2),
                null,
                new ListNode(-1)
        };
        Solution res =new Solution();
        ListNode ll= res.mergeKLists(lists);
        while (ll!=null){
            System.out.println(ll.val);
            ll=ll.next;
        }
    }
}
