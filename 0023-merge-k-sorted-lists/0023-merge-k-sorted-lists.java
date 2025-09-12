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
    // private ListNode mergelist(ListNode l1,ListNode l2){
    //     if(l1 == null) return l2;
    //     if(l2 == null) return l1;
    //     ListNode dummy = new ListNode(-1);
    //     ListNode temp = dummy;
    //     while(l1 != null && l2 != null){
    //         if(l1.val < l2.val){
    //             temp.next = l1;
    //             temp = temp.next;
    //             l1 = l1.next;
    //         }
    //         else{
    //             temp.next = l2;
    //             temp = temp.next;
    //             l2 = l2.next;
    //         }
    //     }
    //     if(l1!=null) temp.next = l1;
    //     if(l2 != null) temp.next = l2;
    //     return dummy.next;
    // }
    public ListNode mergeKLists(ListNode[] lists) {
        // int n = lists.length;
        // if(n==0){
        //     return null;
        // }
        // ListNode head = lists[0];
        // for(int i=1;i<n;i++){
        //     ListNode temp = lists[i];
        //     head = mergelist(head,temp);
        // }
        // return head;
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a,b)-> a.val - b.val);
        for(ListNode list:lists){
            if(list != null){
                heap.add(list);
            }
        }
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while(!heap.isEmpty()){
            ListNode node = heap.poll();
            temp.next = node;
            temp = temp.next;
            if(node.next != null){
                heap.add(node.next);
            }
        }
        return head.next;
    }
}