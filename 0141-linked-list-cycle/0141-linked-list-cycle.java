/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode high = head;
        if (head == null || head.next == null) {
            return false;
        }
        while (high != null && high.next != null) {
            slow = slow.next;
            high = high.next.next;
            if (slow == high) {
                return true;
            }
        }
        return false;
    }
}