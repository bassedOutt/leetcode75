package com.murmylo.volodymyr;

import com.murmylo.volodymyr.structures.TreeNode;

public class IsValidBST {

    /**
     * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
     * A valid BST is defined as follows:
     * The left
     * subtree
     * of a node contains only nodes with keys less than the node's key.
     * The right subtree of a node contains only nodes with keys greater than the node's key.
     * Both the left and right subtrees must also be binary search trees.
     * <a href="https://leetcode.com/problems/validate-binary-search-tree/?envType=study-plan&id=level-1">LeetCode</a>
     */
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer minVal, Integer maxVal) {
        if (node == null) {
            return true;
        }
        if ((minVal != null && node.val <= minVal) || (maxVal != null && node.val >= maxVal)) {
            return false;
        }
        return isValidBST(node.left, minVal, node.val) && isValidBST(node.right, node.val, maxVal);
    }

}
