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
    public ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return null;
        }
        
        if(list1 == null) {
            return list2;
        }
        
        if(list2 == null) {
            return list1;
        }
        
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode resultHead = new ListNode();
        ListNode resultPtr = resultHead;
        while(temp1 != null && temp2 != null) {
            if(temp1.val < temp2.val) {
                resultPtr.next = temp1;
                temp1 = temp1.next;
            } else {
                resultPtr.next = temp2;
                temp2 = temp2.next;
            }
            resultPtr = resultPtr.next;
        }
        while(temp1 != null) {
            resultPtr.next = temp1;
            temp1 = temp1.next;
            resultPtr = resultPtr.next;
        }
        while(temp2 != null) {
            resultPtr.next = temp2;
            temp2 = temp2.next;
            resultPtr = resultPtr.next;
        }
        return resultHead.next;
    }
}