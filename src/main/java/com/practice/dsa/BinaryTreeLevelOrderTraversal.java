package com.practice.dsa;

import java.util.LinkedList;
import java.util.Queue;

//Level Traversal starts from root and goes by traversing each level
public class BinaryTreeLevelOrderTraversal {
    private TreeNode root;
    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        this.root = new TreeNode(1);
        this.root.left = new TreeNode(2);
        this.root.right = new TreeNode(3);
        this.root.left.left = new TreeNode(4);
        this.root.left.right = new TreeNode(5);
    }

    public void LevelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.println(temp.data);
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal tree = new BinaryTreeLevelOrderTraversal();
        tree.createBinaryTree();
        tree.LevelOrderTraversal(tree.root);
    }
}
