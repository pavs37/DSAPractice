package com.practice.dsa;

import java.util.Stack;


//Pre order traversal means root then traverse left subtree then right subtree

public class BinaryTreePreOrderDemo {
    private TreeNode root;
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
     TreeNode first = new TreeNode(1);
     TreeNode second = new TreeNode(2);
     TreeNode third = new TreeNode(3);
     TreeNode fourth = new TreeNode(4);
     TreeNode fifth = new TreeNode(5);
     first.left = second;
     first.right = third;
     second.left = fourth;
     second.right = fifth;
     this.root = first;
    }
    //pre order  travesral means reading all left nodes and then right

    public void TraversePreOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data+" ");
        if(root.left != null){

            TraversePreOrder(root.left);
        }
        if(root.right != null){

            TraversePreOrder(root.right);
        }

    }

    public void iterativePreOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){

            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");

            if(temp.right != null){ // right push first bcos stack follows last in first out.
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }


    public static void main(String[] args) {
        BinaryTreePreOrderDemo demo = new BinaryTreePreOrderDemo();
        demo.createBinaryTree();
       //demo.TraversePreOrder(demo.root);
       // demo.iterativePreOrder(demo.root);

    }
}
