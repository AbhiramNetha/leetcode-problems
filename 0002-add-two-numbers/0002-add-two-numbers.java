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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int carry =0;
        ListNode curr = dummy;
        while(l1 != null || l2 !=null){
            int sum =0;
            int digit1 = (l1 != null)? l1.val : 0;
            int digit2 = (l2 != null)? l2.val : 0;
            sum = digit1 +digit2+carry;
            ListNode newnode = new ListNode(sum%10);
            carry= sum/10;
            curr.next = newnode;
            curr=curr.next;
            if(l1!=null) l1=l1.next;
            if(l2!= null) l2=l2.next;
        }
        if(carry!=0){
            ListNode newnode = new ListNode(carry);
            curr.next = newnode;
        }
        return dummy.next;
    }
}