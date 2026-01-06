/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode X = findNodeLocation(root, x);
        TreeNode Y = findNodeLocation(root, y);
        if (checkParent(root,X.val, Y.val)) {
            return false;
        }
        if (findLevel(root, X.val, 0) == findLevel(root, Y.val, 0)) {
            return true;
        }
        return false;
    }

    boolean checkParent(TreeNode node, int x, int y) {
        if (node == null) {
            return false;
        }
        if (node.right != null && node.left != null) {
            if ((node.left.val == x && node.right.val == y) ||
                    (node.left.val == y && node.right.val == x)) {
                return true;
            }
        }
        return checkParent(node.right, x, y) || checkParent(node.left, x, y);
    }

    TreeNode findNodeLocation(TreeNode node, int val) {
        if (node == null) {
            return null;
        }
        if (node.val == val) {
            return node;
        }
        TreeNode right = findNodeLocation(node.right, val);
        if (right != null) {
            return right;
        }
        return findNodeLocation(node.left, val);
    }

    public int findLevel(TreeNode node, int val, int l) {
        if (node == null) {
            return 0;
        }
        if (node.val == val) {
            return l;
        }
        int left = findLevel(node.left, val, l + 1);
        if (left != 0) {
            return left;
        }

        return findLevel(node.right, val, l + 1);
    }

}