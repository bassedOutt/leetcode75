package com.murmylo.volodymyr.structures;


public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }

    public static TreeNode createBinaryTreeFromArray(Integer[] arr) {
        return createNodeFromArray(arr, 0);
    }

    private static TreeNode createNodeFromArray(Integer[] arr, int index) {
        if (index >= arr.length || arr[index] == null) {
            return null;
        }

        TreeNode node = new TreeNode(arr[index]);
        node.left = createNodeFromArray(arr, 2 * index + 1);
        node.right = createNodeFromArray(arr, 2 * index + 2);

        return node;
    }
}

