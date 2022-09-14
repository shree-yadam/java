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
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) {
            return null;
        }
        
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        for(int i = 0; i < n && fastPtr != null; i++) {
            fastPtr = fastPtr.next;
        }
        if(fastPtr == null) {
            return head.next;
        }
        while(fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }
        
        slowPtr.next = slowPtr.next.next;
        
        return head;
    }
}