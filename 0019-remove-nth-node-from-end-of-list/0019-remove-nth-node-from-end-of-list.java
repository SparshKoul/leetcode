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
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        int start=size-n;//0based indx
        
        if (start == 0) {
            //head = head.next;
            return head=head.next;
        }

        ListNode tempp=head;
        for(int i=0;i<start-1;i++){
            tempp=tempp.next;
        }

        tempp.next= tempp.next.next;
        return head;
    }
}