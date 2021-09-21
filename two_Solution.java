package com.leetcode.test2;

/**
 * @Author: LiuHu
 * @Date: 2021/7/29 21:46
 * @Version 1.0
 *
 * 所有链表都要往后走 别忘了都next
 *
 *
 */
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}

public class two_Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre=new ListNode(0);
        ListNode cur=pre;
        int carry=0;//进位标志
        while (l1!=null || l2!=null){
            /*
            2 4 3
            5 6 4
            7 0 8
             */

            int x =l1==null?0:l1.val;
            int y =l2==null?0:l2.val;
            int sum=x+y+carry;

            carry=sum/10;
            sum=sum%10;

            cur.next=new ListNode(sum);
            cur=cur.next;


            /*
            指针只存在于c语言中，Java中是没有指针的，空指针就是空引用，
            java空指针异常就是引用本身为空，却调用了方法，这个时候就会
            出现空指针异常。可以理解，成员变量和方法是属于对象的（除去
            静态），在对象中才存在相对应的成员变量和方法，然后通过对象
            去调用这些成员变量和方法。对于空指针来说，它不指向任何对象，
            也就没有所谓的成员变量和方法，这个时候用它去调用某些属性和方法，
            当然会出现空指针异常。

             */
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }

        }
        if(carry==1){
            cur.next=new ListNode(1);
        }
        return pre.next;


    }

    public static void main(String[] args) {

        ListNode l1=new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2=new ListNode(5,new ListNode(6,new ListNode(4)));
        two_Solution solution=new two_Solution();
        ListNode ll=solution.addTwoNumbers(l1,l2);
        while(ll!=null) {
            System.out.println(ll.val);
            ll=ll.next;
        }


    }

}
