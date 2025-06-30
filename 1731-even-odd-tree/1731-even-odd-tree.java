import java.util.*;

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
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int levelIndex = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int prevVal = (levelIndex % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();

                if (levelIndex % 2 == 0) {
                    // Even level: values should be odd and strictly increasing
                    if (temp.val % 2 == 0 || temp.val <= prevVal) {
                        return false;
                    }
                } else {
                    // Odd level: values should be even and strictly decreasing
                    if (temp.val % 2 != 0 || temp.val >= prevVal) {
                        return false;
                    }
                }

                prevVal = temp.val;

                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }

            levelIndex++;
        }

        return true;
    }
}
