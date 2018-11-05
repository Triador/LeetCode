package easy;

import model.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTrimBinarySearchTree {

    @Test
    public void testTrimBSTCase1() {
        TrimBinarySearchTree trimBinarySearchTree = new TrimBinarySearchTree();

        TreeNode actualNode = new TreeNode(1);
        actualNode.left = new TreeNode(0);
        actualNode.right = new TreeNode(2);

        TreeNode expectedNode = new TreeNode(1);
        expectedNode.right = new TreeNode(2);

        assertTrue(TreeNode.compare(expectedNode, trimBinarySearchTree.trimBST(actualNode, 1, 2)));
    }

    @Test
    public void testTrimBSTCase2() {
        TrimBinarySearchTree trimBinarySearchTree = new TrimBinarySearchTree();

        TreeNode actualNode = new TreeNode(3);
        actualNode.left = new TreeNode(0);
        actualNode.right = new TreeNode(4);
        actualNode.left.right = new TreeNode(2);
        actualNode.left.right.left = new TreeNode(1);

        TreeNode expectedNode = new TreeNode(3);
        expectedNode.left = new TreeNode(2);
        expectedNode.left.left = new TreeNode(1);

        assertTrue(TreeNode.compare(expectedNode, trimBinarySearchTree.trimBST(actualNode, 1, 3)));
    }

    @Test
    public void testTrimBSTCase3() {
        TrimBinarySearchTree trimBinarySearchTree = new TrimBinarySearchTree();

        TreeNode actualNode = new TreeNode(3);
        actualNode.left = new TreeNode(1);
        actualNode.right = new TreeNode(4);
        actualNode.left.right = new TreeNode(2);

        TreeNode expectedNode = new TreeNode(3);
        expectedNode.right = new TreeNode(4);

        assertTrue(TreeNode.compare(expectedNode, trimBinarySearchTree.trimBST(actualNode, 3, 4)));
    }
}
