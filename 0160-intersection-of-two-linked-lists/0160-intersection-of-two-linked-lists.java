/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode n1 = headA;
        ListNode n2 = headB;

        while (n1 != n2) {
            if (n1 == null) {
                n1 = headB;
            } else {
                n1 = n1.next;
            }

            if (n2 == null) {
                n2 = headA;
            } else {
                n2 = n2.next;
            }
        }
        return n1;
    }
}