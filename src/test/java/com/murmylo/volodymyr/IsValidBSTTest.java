package com.murmylo.volodymyr;

import com.murmylo.volodymyr.trees.IsValidBST;
import com.murmylo.volodymyr.structures.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class IsValidBSTTest {

    @Test
    void shouldReturnFalse() {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(6);
        root.left = node1;
        root.right = node2;
        TreeNode node3 = new TreeNode(3);
        node1.left = node3;
        TreeNode node4 = new TreeNode(5);
        node2.left = node4;
        TreeNode node5 = new TreeNode(7);
        node2.right = node5;
        TreeNode node6 = new TreeNode(8);
        node4.right = node6;
        IsValidBST isValidBST = new IsValidBST();
        assertFalse(isValidBST.isValidBST(root));
    }
}
