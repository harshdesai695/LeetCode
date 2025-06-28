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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode sumList = new ListNode(-1);
        ListNode curr = sumList;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum = sum + l1.val;
            }
            if (l2 != null) {
                sum = sum + l2.val;
            }
            ListNode temp = new ListNode(sum % 10);
            carry = sum / 10;
            curr.next = temp;
            curr = curr.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry != 0) {
            ListNode carryNode = new ListNode(carry);
            curr.next = carryNode;
        }

        return sumList.next;
    }
}