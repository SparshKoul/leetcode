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
    public int size(ListNode head){
        if(head==null){
            return 0;
        }
        int count =0;
        ListNode temp=head;
        while(temp !=null){
            count ++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=size(head);

        int start =size-n+1;
        ListNode temp=head;
        if(start ==1){
            return head.next;
        }
        for(int i=1;i<start-1;i++){
            temp=temp.next;
        }
        //temp at one b4
        temp.next=temp.next.next;

        return head;
        
    }
}