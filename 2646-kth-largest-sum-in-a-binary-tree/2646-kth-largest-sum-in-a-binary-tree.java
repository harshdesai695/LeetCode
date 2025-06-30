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
    public long kthLargestLevelSum(TreeNode root, int k) {
        long ans = Integer.MIN_VALUE;
        List<Long> sumList = new ArrayList<>();
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int level=queue.size();
            long currentSum=0;
            for(int i=0;i<level;i++){
                TreeNode temp=queue.poll();
                currentSum=currentSum+temp.val;
            
                if(temp.left!=null){
                    queue.add(temp.left);
                }

                if(temp.right!=null){
                    queue.add(temp.right);
                }

            }
            sumList.add(currentSum);
        }
        if(sumList.size()<k){
            return -1;
        }
        Collections.sort(sumList, Collections.reverseOrder());

        return sumList.get(k-1);

    }
}