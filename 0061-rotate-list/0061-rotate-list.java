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
    private ListNode newhead(ListNode head,int k){
        ListNode temp = head;
        int cnt =0;
        while(temp != null){
            cnt++;
            if(cnt == k){
                return temp;
            }
            temp = temp.next;
        }
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0 || head.next == null) return head;
        int len =1;
        ListNode tail = head;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        if(k%len == 0) return head;
        k=k%len;
        tail.next =  head;
        ListNode newnode = newhead(head,len-k);
        head = newnode.next;
        newnode.next = null;
        return head;
    }
}