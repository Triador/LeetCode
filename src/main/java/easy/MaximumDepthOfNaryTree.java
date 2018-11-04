package easy;

import model.Node;

import java.util.ArrayList;
import java.util.List;

public class MaximumDepthOfNaryTree {

    public int maxDepth(Node root) {
        if (root == null) return 0;
        if (root.children == null || root.children.size()==0) return 1;
        int max = 0;
        for (Node child: root.children)
            max = Math.max(max, maxDepth(child));
        return max+1;
    }

    public static void main(String[] args) {
        Node root = new Node();
        root.val = 1;
        List<Node> children = new ArrayList<>();
        Node node1 = new Node();
        node1.val = 2;
        children.add(node1);
        root.children = children;

        List<Node> children1 = new ArrayList<>();
        Node node2 = new Node();
        node2.val = 5;
        Node node3 = new Node();
        node3.val = 6;
        children1.add(node2);
        children1.add(node3);
        children.get(0).children = children1;

        MaximumDepthOfNaryTree maximumDepthOfNaryTree = new MaximumDepthOfNaryTree();
        System.out.println(maximumDepthOfNaryTree.maxDepth(root));

    }
}
