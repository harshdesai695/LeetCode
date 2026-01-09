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
    int heightofBT = 0;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        heightofBT = heightOfBinaryTree(root);
        return findDeepest(root, 1);
    }

    public TreeNode findDeepest(TreeNode root, int currentDepth) {
        if (root == null) {
            return null;
        }
        if (currentDepth == heightofBT) {
            return root;
        }
        TreeNode left = findDeepest(root.left, currentDepth + 1);
        TreeNode right = findDeepest(root.right, currentDepth + 1);
        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;
    }

    public int heightOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSubTree = heightOfBinaryTree(root.left);
        int rigthSubTree = heightOfBinaryTree(root.right);

        return 1 + Math.max(leftSubTree, rigthSubTree);
    }

    // public boolean isLeaf(TreeNode root) {
    //     if (root.left == null && root.right == null) {
    //         return true;
    //     }
    //     return false;
    // }
}