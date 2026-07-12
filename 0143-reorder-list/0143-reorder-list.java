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
    public ListNode findmiddle(ListNode head){
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        //slow at 1st half last
        return slow;

    }
    public void reorderList(ListNode head) {

        if(head==null || head.next==null){
            return ;
        }

        ListNode middle=findmiddle(head);
        ListNode next;
        ListNode prev=null;

        while(middle !=null){
            next=middle.next;
            middle.next=prev;
            prev=middle;
            middle=next;
        }
        //2nd half rev doen prev is head

        ListNode left=head;
        ListNode right=prev;

        while (left != null && right != null) {
            ListNode nextL = left.next;
            ListNode nextR = right.next;

            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

        
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val);
            temp=temp.next;
        }

        
    }
}