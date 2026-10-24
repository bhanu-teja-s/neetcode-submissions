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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //REVERSE
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        if(head.next == null){
            return head = null;
        }if(n == 1){
            head = head.next;
        } else {
            curr = prev;
            int count = 1;
            while(count < n-1){
                curr = curr.next;
                count++;
            }
            if(curr.next == null || curr.next.next == null){
                curr.next = null;
            }
            else if(curr.next != null && curr.next.next != null){
                curr.next = curr.next.next;
            }
        }
        curr = head;
        prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}