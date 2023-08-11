package com.murmylo.volodymyr.trees;

import com.murmylo.volodymyr.structures.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NaryTreePreorderTraversal {

    /**
     * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
     * Nary-Tree input serialization is represented in their level order traversal.
     * Each group of children is separated by the null value
     * <a href="https://leetcode.com/problems/n-ary-tree-preorder-traversal/?envType=study-plan&id=level-1">Leet code</a>
     */
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }


    private void preorder(Node node, List<Integer> values) {
        if (node == null) {
            return;
        }
        values.add(node.val);
        if (node.children == null) {
            return;
        }
        for (Node n : node.children) {
            preorder(n, values);
        }
    }

}