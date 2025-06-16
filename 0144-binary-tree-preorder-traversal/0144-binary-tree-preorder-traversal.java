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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        DFSPreOrder(root,arr);
        return arr;
    }

    public void DFSPreOrder(TreeNode root,List<Integer> arr) {
        if (root == null) {
            return;
        }
        // System.out.print(" " + root.val);
        arr.add(root.val);
        DFSPreOrder(root.left,arr);
        DFSPreOrder(root.right,arr);
    }

}