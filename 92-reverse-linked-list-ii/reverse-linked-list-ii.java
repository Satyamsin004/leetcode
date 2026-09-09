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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        if(head == null){
            return null;
        }

        ListNode now = head;
        ListNode before = null;
        int pos = 1;
        while(pos<left){
                before = now;
                now = now.next;
                pos++;
            }
        
        ListNode curr = now;
        ListNode prev = null;
        int times = (right - left) + 1;
        while(times --> 0){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;  
        }
        now.next = curr;
        if(before != null){
            before.next = prev;
            return head;
        }
        return prev;
        
    }
}