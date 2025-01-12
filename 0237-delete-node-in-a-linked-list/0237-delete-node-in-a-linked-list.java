/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
        // ListNode curr=node;
        // ListNode pcurr=node;
        // int temp;
        // while(curr.next!=null){
        // temp=curr.val;
        // curr.val=curr.next.val;
        // curr.next.val=temp;
        // curr=curr.next;
        // }

    }
}