/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                ListNode temp=head;
                //slow will tell wether loop is not that it is start of loop
                while(temp!=slow){
                    temp=temp.next;
                    slow=slow.next;

                }
                return temp;

            }
        }
        return null;
    }
}