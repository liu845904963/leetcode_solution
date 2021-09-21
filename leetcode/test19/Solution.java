package com.leetcode.test19;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

/**
 * @Author: LiuHu
 * @Date: 2021/8/19 14:44
 * @Version 1.0
 */

/*
   pre  back head  地址相同
   并且 浅拷贝 pre back  只要改变了个节点的关系 所有的都会跟着改变
   每个节点在内存中都是有编号的（这三个都指向了同一个引用，也就是说，三者其中一个操作了，
   节点，都会导致整个内存中的节点发生改变（back 将 3号节点的下个节点 指向了 下下个，）

    -------------------
   |                   |                        -------
   |L1->L2->L3->L4->L5 |   heap <-----         |  0x001 |   stack
   |                   |                        -------
    -------------------
  --------------------------------内存-------------------------------


*/
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre=new ListNode();
        ListNode back = new ListNode();
        pre=head;
        back=head;

        for(int i=0 ; i<n ;i++){

                pre=pre.next==null?null:pre.next;

        }

        if(pre==null){

            return head.next;
        }
        while(pre.next!=null){
            pre=pre.next;
            back=back.next;


        }


        back.next=back.next.next==null?null:back.next.next;

        return head;
    }

    public static void main(String[] args) {
        Solution a= new Solution();
        ListNode example=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode example2=new ListNode(1);
        ListNode x=a.removeNthFromEnd(example,1);
        while (x!=null){
            System.out.println(x.val);
            x=x.next;
        }
    }
}
