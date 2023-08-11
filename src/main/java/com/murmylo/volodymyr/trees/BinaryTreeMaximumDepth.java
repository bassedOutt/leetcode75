package com.murmylo.volodymyr.trees;

import com.murmylo.volodymyr.structures.TreeNode;

public class BinaryTreeMaximumDepth {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    public int maxDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        int value1 = maxDepth(root.left, depth + 1);
        int value2 = maxDepth(root.right, depth + 1);
        return Math.max(value1, value2);
    }
}
