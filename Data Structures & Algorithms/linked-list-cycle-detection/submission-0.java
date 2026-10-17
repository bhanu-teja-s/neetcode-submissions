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
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while(ptr2.next != null && ptr2 != null){
            if(ptr1.next != null){
                ptr1 = ptr1.next;
            } else {
                return false;
            }
            if(ptr2.next.next != null){
                ptr2 = ptr2.next.next;
            } else {
                return false;
            }
            if(ptr1 == ptr2){
            return true;
            }
        }
        return false;
    }
}
