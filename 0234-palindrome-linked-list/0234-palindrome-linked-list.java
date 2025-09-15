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
    private ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newnode = reverse(head.next);
        ListNode front = head.next;
        head.next = null;
        front.next = head;
        return newnode;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode temp = head;
        ListNode slow = temp;
        ListNode fast = temp.next;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // ListNode mid = slow;
        ListNode newhead = reverse(slow.next);
        ListNode first = head;
        ListNode second = newhead;
        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}