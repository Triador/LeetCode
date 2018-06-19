package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMergeTwoBinaryTrees {

    @Test
    public void mergeTrees() {
        TreeNode treeNode = new TreeNode(0);
        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(3);
        treeNode1.right = new TreeNode(2);
        treeNode1.left.left = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode2.left = new TreeNode(1);
        treeNode2.right = new TreeNode(3);
        treeNode2.left.right = new TreeNode(4);
        treeNode2.right.right = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode3.left = new TreeNode(4);
        treeNode3.right = new TreeNode(5);
        treeNode3.left.left = new TreeNode(5);
        treeNode3.left.right = new TreeNode(4);
        treeNode3.right.right = new TreeNode(7);
        assertTrue(treeNode.compare(treeNode3, mergeTwoBinaryTrees.mergeTrees(treeNode1, treeNode2)));
        treeNode3.right.right = new TreeNode(8);
        assertFalse(treeNode.compare(treeNode3, mergeTwoBinaryTrees.mergeTrees(treeNode1, treeNode2)));
    }
}
