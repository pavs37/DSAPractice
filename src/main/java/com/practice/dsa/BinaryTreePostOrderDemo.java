package com.practice.dsa;

import java.util.Stack;
//post order traversal is first left tree then right tree and last is the root.
public class BinaryTreePostOrderDemo {
    private TreeNode root;
    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int value;
        public TreeNode(int value) {
            this.value = value;
        }
    }

    public void createBinaryTree(){
        this.root = new TreeNode(1);
        this.root.left = new TreeNode(2);
        this.root.right = new TreeNode(3);
        this.root.left.left = new TreeNode(4);
        this.root.left.right = new TreeNode(5);
    }

    public void recursivePostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        recursivePostOrder(root.left);
        recursivePostOrder(root.right);
        System.out.println(root.value);
    }
    public void iterativePostorder(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            }
            else {
                TreeNode temp  = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.value);
                    while(!stack.empty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.println(temp.value);
                    }
                }else {
                    current = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        BinaryTreePostOrderDemo demo = new BinaryTreePostOrderDemo();
        demo.createBinaryTree();
       // demo.recursivePostOrder(demo.root);
        demo.iterativePostorder(demo.root);
    }
}
