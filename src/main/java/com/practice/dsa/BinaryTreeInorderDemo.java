package com.practice.dsa;

import java.util.Stack;

//In order traversal means traverse left subtree in inorder fashion, visit root node and then traverse right subtree in inorder traversal

public class BinaryTreeInorderDemo {

    private TreeNode root;

    private class  TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void CreateBinaryTree(){

        this.root = new TreeNode(1);
        this.root.left = new TreeNode(2);
        this.root.right = new TreeNode(3);
        this.root.left.left = new TreeNode(4);
        this.root.left.right = new TreeNode(5);
    }

    public void recursiveInorder(TreeNode root){
        if(root == null){
            return;
        }
        recursiveInorder(root.left);
        System.out.println(root.data);
        recursiveInorder(root.right);
    }

    public void iterativeInorder(TreeNode root){
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();

        while(current != null || !stack.isEmpty()){
            if(current != null){
                stack.push(current);
                current = current.left;
            }
            else
            {
                TreeNode temp = stack.pop();
                System.out.println(temp.data);
                current = temp.right;
            }

        }
    }

    public static void main(String args[]){
        BinaryTreeInorderDemo demo = new BinaryTreeInorderDemo();
        demo.CreateBinaryTree();
        //demo.recursiveInorder(demo.root);
        demo.iterativeInorder(demo.root);
    }
}
