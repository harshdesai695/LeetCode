/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        if (head == null) {
            return head;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode curr = head;
        ListNode prev = temp;

        while (curr != null) {
            if (set.contains(curr.val)) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return temp.next;
    }
}