package com.leetcode.test21;

/**
 * @Author: LiuHu
 * @Date: 2021/9/2 15:14
 * @Version 1.0
 */
public class Solution2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;//合并后 返回
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
    public static void main(String[] args) {
//        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(4)));
//        ListNode l2=new ListNode(1 ,new ListNode(3,new ListNode(4)));
        ListNode l1=new ListNode(0);
        ListNode l2=new ListNode();
        Solution2 ll =new Solution2();
        ListNode res =ll.mergeTwoLists(l1,l2);

        while (res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }

    }

}
