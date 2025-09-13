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
    // private ListNode convert(int[] arr){
    //     ListNode head = new ListNode(arr[0]);
    //     ListNode temp = head;
    //     for(int i=1;i<arr.length;i++){
    //         ListNode mover = new ListNode(arr[i]);
    //         temp.next = mover;
    //         temp = temp.next;
    //     }
    //     return head;
    // }
    private int len(ListNode head){
        ListNode temp = head;
        int cnt =0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int n = len(temp);
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        // ListNode newhead = head;
        temp = head;
        int i=0;
        while(temp!=null){
            temp.val = arr[i];
            temp = temp.next;
            i=i+1;
        }
        return head;
    }
}