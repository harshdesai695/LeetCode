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
    public ListNode middleNode(ListNode head) {
        int llSize = 0;
        ListNode curr = head;
        ListNode cCurr = head;
        while (curr != null) {
            llSize++;
            curr = curr.next;
        }
        double lsize = 0.0;
        double msize = Math.ceil(llSize / 2);
        while (cCurr != null) {
            if (lsize == msize) {
                return cCurr;
            } else {
                lsize++;
                cCurr = cCurr.next;
            }
        }
    return head;
    }
}