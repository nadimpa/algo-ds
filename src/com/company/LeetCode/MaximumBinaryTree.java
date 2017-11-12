package com.company.LeetCode;

import java.util.Arrays;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

public class MaximumBinaryTree {
    public static void main(String[] args) {
        int a  = -Integer.MAX_VALUE;
        String sa = "abcd";
        sa.length();
        System.out.println(a);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        int index = 0;
        int maxValue = -Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > maxValue) {
                maxValue = nums[i];
                index = i;
            }
        }
        int[] firstHalf = Arrays.copyOfRange(nums, 0, index);
        int[] secondHalf = Arrays.copyOfRange(nums, index+1, nums.length);
        TreeNode treeNode = new TreeNode(maxValue);
        treeNode.left = constructMaximumBinaryTree(firstHalf);
        treeNode.right = constructMaximumBinaryTree(secondHalf);
        return treeNode;
    }

}
