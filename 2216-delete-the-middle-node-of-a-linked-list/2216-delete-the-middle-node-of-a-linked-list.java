/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next==null ) {
            return null;
        }
        int len = 0;
        ListNode curr = head;

        while (curr != null) {
            len++;
            curr = curr.next;
        }
        int mid = len / 2;
        int count = 0;
        ListNode ncurr = head;
        if (mid == 1 && len == 2) {
            head.next = null;
            return head;
        }
        while (count < mid - 1) {
            ncurr = ncurr.next;
            count++;
        }
        ncurr.next = ncurr.next.next;
        return head;
    }
}