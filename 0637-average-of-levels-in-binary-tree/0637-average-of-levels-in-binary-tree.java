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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for(int i=0;i<levelSize;i++){
                TreeNode current=queue.poll();
                currentLevel.add(current.val);

                if(current.left!=null){
                    queue.add(current.left);
                }

                if(current.right!=null){
                    queue.add(current.right);
                }
            }

            ans.add(findAvg(currentLevel));
        }
        return ans;
    }

    public Double findAvg(List<Integer> arr){
        Double sum=0.0;

        for(int i:arr){
            sum=sum+i;
        }

        return sum/arr.size();

    }
}