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
    long tSum = 0;
    long maxProduct = 0;
    int MOD = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        tSum = totalSum(root);
        sumProduct(root);
        return (int) (maxProduct % MOD);
    }

    public long totalSum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        long leftSum = totalSum(node.left);
        long rightSum = totalSum(node.right);
        return node.val + leftSum + rightSum;
    }

    public long sumProduct(TreeNode node) {
        if (node == null) {
            return 0;
        }
        long leftSum = sumProduct(node.left);
        long rightSum = sumProduct(node.right);

        long currSum = node.val + leftSum + rightSum;
        long product = (currSum) * (tSum - currSum);
        maxProduct = Math.max(maxProduct, product);
        return currSum;
    }

}