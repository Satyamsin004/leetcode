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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;
        head = second;
        ListNode prev= null;

        while (true) {
            ListNode temp = second.next;
            second.next = first;
            first.next = temp;

            if (temp == null || temp.next == null) {
                break;
            }
            prev = first;
            first = temp;
           
            second = temp.next;
             prev.next = second;;
        }
        return head;

    }
}