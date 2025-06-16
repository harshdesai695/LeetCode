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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        DFSPostOrder(root, arr);
        return arr;
    }

    public void DFSPostOrder(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        // System.out.print(" " + root.val);
        DFSPostOrder(root.left, arr);
        DFSPostOrder(root.right, arr);
        arr.add(root.val);
    }
}