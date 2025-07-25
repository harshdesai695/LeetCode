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
class BSTIterator {

    TreeNode visit;
    Stack<TreeNode> st;

    public BSTIterator(TreeNode root) {
        visit = root;
        st = new Stack();
    }

    public int next() {
         while (visit != null) {
            st.push(visit);
            visit = visit.left;
        }
        TreeNode next = st.pop();
        visit = next.right;
        return next.val;
    }

    public boolean hasNext() {
        if (visit != null || !st.empty()) {
            return true;
        }
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */