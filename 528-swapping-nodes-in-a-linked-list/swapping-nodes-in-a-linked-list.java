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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int[] arr = new int[size];
        temp = head;
        int i = 0;
        while (temp != null) {
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }
        int tempo = arr[k - 1];
        arr[k - 1] = arr[size - k];
        arr[size - k] = tempo;

        ListNode headd = new ListNode(arr[0]);
        ListNode temporary = headd;
        for (int j = 1; j < arr.length; j++) {
            temporary.next = new ListNode(arr[j]);
            temporary = temporary.next;
        }
        return headd;

    }
}