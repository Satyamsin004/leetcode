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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        ListNode[] result = new ListNode[k];
        int partsize = n / k;
        int extrasize = n % k;
        temp = head;

        for (int i = 0; i < k; i++) {
            int currentsize = partsize;
           
            if (extrasize > 0) {
                currentsize++;
                extrasize--;
            }
            if (currentsize == 0) {
                result[i] = null;
                continue;
            }
            result[i] = temp;
            for (int j = 1; j < currentsize; j++) {
                temp = temp.next;
            }
            ListNode next = temp.next;
            temp.next = null;
            temp = next;
        }
        return result;

    }
}