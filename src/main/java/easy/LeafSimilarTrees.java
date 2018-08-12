package easy;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1List = new ArrayList<>();
        List<Integer> root2List = new ArrayList<>();

        deepSearch(root1, root1List);
        deepSearch(root2, root2List);

        if (root1List.size() != root2List.size())
            return false;

        for (int i = 0; i < root1List.size(); i++) {
            if (!root1List.get(i).equals(root2List.get(i)))
                return false;
        }

        return true;
    }

    public void deepSearch(TreeNode treeNode, List<Integer> list) {
        if (treeNode.right == null && treeNode.left == null) {
            list.add(treeNode.val);
        } else {
            if (treeNode.left != null) deepSearch(treeNode.left, list);
            if (treeNode.right != null) deepSearch(treeNode.right, list);
        }
    }
}
