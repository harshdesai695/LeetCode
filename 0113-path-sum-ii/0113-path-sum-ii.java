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
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path=new ArrayList<>();
        DFS(root,path,targetSum);
        return ans; 
    }

    public void DFS(TreeNode root, List<Integer> path, int remainingSum) {
        if (root == null) {
            return;
        }
        path.add(root.val);

        if (root.left == null && root.right == null && remainingSum == root.val) {
            ans.add(new ArrayList<>(path));
        }

        DFS(root.left, path, remainingSum - root.val);
        DFS(root.right, path, remainingSum - root.val);

        path.remove(path.size() - 1);

    }
}