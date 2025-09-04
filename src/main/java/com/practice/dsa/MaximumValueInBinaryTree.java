package com.practice.dsa;

import javax.swing.tree.TreeNode;

// here we tried by recursive way of finding the max of each left and right tree and then comparing between root and left and right
public class MaximumValueInBinaryTree {
    TreeNode root;
    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.data = data;
        }
    }
    public int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if (left > result) {
            result = left;
        }
        if (right > result) {
            result = right;
        }
        return result;
    }

    public static void main(String args[]){
        MaximumValueInBinaryTree tree = new MaximumValueInBinaryTree();
        tree.root = new TreeNode(179);
        TreeNode first = new TreeNode(60);
        TreeNode second = new TreeNode(21);
        TreeNode third = new TreeNode(120);
        TreeNode fourth = new TreeNode(307);
        tree.root.left = first;
        tree.root.right = second;
        tree.root.left.left = third;
        tree.root.left.right = fourth;
        int max = tree.findMax(tree.root);
        System.out.println(max);


    }
}
