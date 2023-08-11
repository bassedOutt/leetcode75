package com.murmylo.volodymyr.trees;

import com.murmylo.volodymyr.structures.TreeNode;

public class SymetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricSubTree(root.left, root.right);
    }

    public boolean isSymmetricSubTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val == right.val) {
            return isSymmetricSubTree(left.left, right.right) && isSymmetricSubTree(left.right, right.left);
        } else
            return false;
    }

    public static void main(String[] args) {
        SymetricTree symetricTree = new SymetricTree();
        Integer[] arr = {2, 3, 3, 4, 5, null, 4};
        TreeNode root = TreeNode.createBinaryTreeFromArray(arr);
        System.out.println(symetricTree.isSymmetric(root));
    }
}
