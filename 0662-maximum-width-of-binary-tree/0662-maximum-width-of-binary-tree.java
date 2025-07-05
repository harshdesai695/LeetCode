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
 * }/**
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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> index = new LinkedList<>();
        queue.add(root);
        index.add(1); 

        int max = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int start = 0, end = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                int idx = index.remove();

                if (i == 0){
                    start = idx;
                } 
                if (i == size - 1){
                    end = idx;
                } 

                if (node.left != null) {
                    queue.add(node.left);
                    index.add(2 * idx);
                }

                if (node.right != null) {
                    queue.add(node.right);
                    index.add(2 * idx + 1);
                }
            }

            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}
