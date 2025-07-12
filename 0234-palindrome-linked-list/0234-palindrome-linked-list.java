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
    public boolean isPalindrome(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        ListNode curr=head;

        while(curr!=null){
            lst.add(curr.val);
            curr=curr.next;
        }

        int start=0;
        int end=lst.size()-1;

        while(start<end){
            if(lst.get(start)!=lst.get(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}