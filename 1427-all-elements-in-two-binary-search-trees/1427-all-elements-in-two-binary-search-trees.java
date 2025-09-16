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
    List<Integer> arr;

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        arr = new ArrayList<>();
        InOrder(root1);
        InOrder(root2);
        Collections.sort(arr);
        return arr;
    }

    public void InOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        arr.add(root.val);
        InOrder(root.right);
    }
}