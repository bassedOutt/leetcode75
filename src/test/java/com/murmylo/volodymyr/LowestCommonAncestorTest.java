package com.murmylo.volodymyr;

import com.murmylo.volodymyr.trees.LowestCommonAncestor;
import com.murmylo.volodymyr.structures.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonAncestorTest {

    @Test
    void test1() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        LowestCommonAncestor lca = new LowestCommonAncestor();
        TreeNode node1 = lca.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4));
        assertEquals(node1.val,6);
    }
}
