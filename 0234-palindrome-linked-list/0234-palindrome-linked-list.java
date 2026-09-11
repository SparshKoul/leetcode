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
    public ListNode getmid(ListNode head){
        if(head == null || head.next ==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast =head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode mid= getmid(head);
        ListNode curr =mid.next;
        ListNode prev =null;
        ListNode next ;
        while(curr!=null){
            next=curr.next;
            curr.next =prev;
            prev =curr;
            curr=next;
        }

        ListNode first =head;
        ListNode second =prev;
        while(second !=null){
            if(first.val !=second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
        
        
    }
}