/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointa=headA;
        ListNode pointb= headB;
        while(pointa !=pointb){
            if(pointa==null){
                pointa=headB;
            }else{
                pointa=pointa.next;
            }

            if(pointb==null){
                pointb=headA;
            }else{
                pointb=pointb.next;
            }

        }
        return pointa;
        
    }
}