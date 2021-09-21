package com.leetcode.test94;

import javax.swing.text.InternationalFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

/**
 * @Author: LiuHu
 * @Date: 2021/9/17 10:37
 * @Version 1.0
 */
class TreeNode {
     int val;TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res =new ArrayList<>();
        inorder(root,res);
        return res;

    }
    public void inorder(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);

        inorder(root.left,res);
        inorder(root.right,res);
    }

    public static void main(String[] args) {
        TreeNode a =new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),
                                       new TreeNode(3,new TreeNode(6),new TreeNode(7)));
        Solution aa=new Solution();
        List<Integer> integers = aa.inorderTraversal(a);
        System.out.println(integers);
    }
}
