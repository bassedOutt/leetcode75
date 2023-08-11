package com.murmylo.volodymyr.trees;

import com.murmylo.volodymyr.structures.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLeveOrderTraversal {
    /**
     * Given the root of a binary tree, return the level order traversal of its nodes' values.
     * (i.e., from left to right, level by level).
     * Example:
     * Input: root = [3,9,20,null,null,15,7]
     * Output: [[3],[9,20],[15,7]]
     * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/?envType=study-plan&id=level-1">Leet code</a>
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<List<Integer>> list = new ArrayList<>();
        processChildren(Collections.singletonList(root), list);
        return list;
    }

    void processChildren(List<TreeNode> nodes, List<List<Integer>> allList) {
        if (nodes.isEmpty()) {
            return;
        }
        List<TreeNode> levelNodes = new ArrayList<>();
        List<Integer> leveValues = new ArrayList<>();
        for (TreeNode node : nodes) {
            if (node != null) {
                leveValues.add(node.val);
                levelNodes.add(node.left);
                levelNodes.add(node.right);
            }
        }
        if(!leveValues.isEmpty()) {
            allList.add(leveValues);
        }
        processChildren(levelNodes, allList);
    }
}
