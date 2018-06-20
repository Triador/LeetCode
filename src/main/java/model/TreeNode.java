package model;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }

    public boolean compare(TreeNode t1, TreeNode t2) {
        if (t1 != null && t2 != null) {
            if (t1.val != t2.val) {
                return false;
            } else {
                compare(t1.left, t2.left);
                compare(t1.right, t2.right);
            }
        } else if (t1 == null && t2 != null || t1 != null) {
            return false;
        }

        return true;
    }
}
