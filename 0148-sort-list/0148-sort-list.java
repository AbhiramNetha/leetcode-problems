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
    // private int len(ListNode head){
    //     ListNode temp = head;
    //     int cnt =0;
    //     while(temp != null){
    //         cnt++;
    //         temp = temp.next;
    //     }
    //     return cnt;
    // }
    private ListNode Merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(l1!=null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                temp = l1;
                l1 = l1.next;;
            }
            else{
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }
        if(l1!=null) temp.next = l1;
        if(l2 != null) temp.next = l2;
        return dummy.next;
    }
    private ListNode middle(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode mid =  middle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        left = sortList(left);
        right = sortList(right);
        return Merge(left,right);
        // ListNode temp = head;
        // int n = len(temp);
        // int[] arr = new int[n];
        
        // for(int i=0;i<n;i++){
        //     arr[i] = temp.val;
        //     temp = temp.next;
        // }
        // Arrays.sort(arr);
        // // ListNode newhead = head;
        // temp = head;
        // int i=0;
        // while(temp!=null){
        //     temp.val = arr[i];
        //     temp = temp.next;
        //     i=i+1;
        // }
        // return head;

    }
}