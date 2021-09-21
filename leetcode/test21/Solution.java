package com.leetcode.test21;

import com.sun.source.util.TaskListener;

import java.util.List;

/**
 * @Author: LiuHu
 * @Date: 2021/9/2 13:31
 * @Version 1.0
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
//
//
//  输入：l1 = [1,2,4], l2 = [1,3,4]
//  输出：[1,1,2,3,4,4]
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);//存放结果：随着指针的改变而改变
        ListNode tail=res;//指针用来遍历
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                tail.next=l1;

                l1=l1.next;
                tail=tail.next;
            }
            else{
                tail.next=l2;
                l2=l2.next;
                tail=tail.next;
            }
        }
        while(l1!=null){
            tail.next=l1;
            l1=l1.next;
            tail= tail.next;
        }
        while(l2!=null){
            tail.next=l2;
            l2=l2.next;
            tail= tail.next;
        }
        return res.next;

    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2=new ListNode(1,new ListNode(3,new ListNode(4)));
        Solution ll =new Solution();
        ListNode res =ll.mergeTwoLists(l1,l2);
        while (res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }

    }

}
