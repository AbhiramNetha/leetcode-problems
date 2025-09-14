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
    public ListNode mergeNodes(ListNode head) {
        if(head == null || (head.next == null && head.val == 0)){
            return null;
        }
        
        ListNode temp = head;
        int sum = 0;
        ListNode dummy = new ListNode(-1);
        ListNode newnode = dummy;
        while(temp != null){
            if(temp.val != 0){
                sum += temp.val;
                if(temp.next.val == 0){
                    ListNode res = new ListNode(sum);
                    newnode.next = res;
                    newnode = newnode.next;
                }
            }
            else{
                sum =0;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}