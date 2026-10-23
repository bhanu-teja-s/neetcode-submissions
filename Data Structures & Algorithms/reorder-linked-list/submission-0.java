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
    public void reorderList(ListNode head) {
        //FIND MID
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //REVERSE HALF
        ListNode temp = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        //MERGE
        while(prev != null){
            ListNode next1 = head.next;
            ListNode next2 = prev.next;
            head.next = prev;
            prev.next = next1;
            head = next1;
            prev = next2;
        }
    }
}