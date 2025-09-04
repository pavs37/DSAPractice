package com.practice.dsa;

import javax.swing.tree.TreeNode;

public class BinarySearchTree {
    private TreeNode root;
    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.data = data;
        }
    }

    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
        }
        else {
            if(data<root.data){
                root.left = insert(root.left,data);
            }
            if(data>root.data){
                root.right = insert(root.right,data);
            }
        }
        return root;
    }

    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public TreeNode search(TreeNode root, int data) {
        if (root == null || root.data == data) {
            return root;
        }

        if (data < root.data) {
            return search(root.left, data);
        }else {
            return search(root.right, data);
        }

    }

    public static void main(String args[])
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = tree.insert(tree.root, 20);
        tree.insert(tree.root, 37);
        tree.insert(tree.root, 14);
        tree.insert(tree.root, 50);
        tree.insert(tree.root, 62);
        tree.inOrderTraversal(tree.root);

        if(tree.search(tree.root, 37) != null){
            System.out.println("found key");
        }else{
            System.out.println("not found");
        }
    }
}
