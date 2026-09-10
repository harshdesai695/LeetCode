/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr;
        ListNode prev;

        if (head == null || head.next == null) {
            return false;
        }

        curr = head.next;
        prev = head;

        while (curr != null && curr.next != null) {
            if (curr == prev) {
                return true;
            }
            curr = curr.next.next;
            prev = prev.next;
        }
        return false;
    }
}