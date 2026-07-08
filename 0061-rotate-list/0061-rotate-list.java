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
    public ListNode rotateRight(ListNode head, int k) {
       if(head ==null ||head.next==null|| k==0){
        return head;
       } 
       ListNode tail=head;
       int size=1;
       while(tail.next!=null){
        tail=tail.next;
        size++;
       }
       //tail at now tail of ll, 

       k=k%size;

       if(k==0){
        return head;
       }

       //circ then make conn
       tail.next=head;

       int steps =size-k-1;

       ListNode newtail=head;
       while(steps>0){
        newtail=newtail.next;
        steps--;
       }

       ListNode newhead=newtail.next;
       newtail.next=null;

       return newhead;

        
    }
}