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
    public ListNode findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;//slow at 1st half end

        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {

        ListNode mid=findmid(head);//1st slow at 1st half end

        //reverse 2nd half of list so we can compare
        ListNode curr=mid.next;
        ListNode prev=null;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //compare both halfs
        ListNode lefthead=head;
        ListNode righthead=prev;


        while(righthead !=null){
            if(lefthead.val!=righthead.val){
                return false;
            }
            lefthead=lefthead.next;
            righthead=righthead.next;
        }
        return true;


        
    }
}