package com.murmylo.volodymyr;

import com.murmylo.volodymyr.structures.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        traverse(root, list);
        return list;
    }

    public void traverse(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) {
            list.add(null);
            return;
        }
        list.add(treeNode.val);
        traverse(treeNode.left, list);
        traverse(treeNode.right, list);
    }
}
