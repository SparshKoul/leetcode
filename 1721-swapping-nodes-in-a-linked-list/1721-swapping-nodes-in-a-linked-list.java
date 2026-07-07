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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int size=0;
        while(temp !=null){
            size++;
            temp=temp.next;
        }

        ListNode start=head;
        for(int i=1;i<k;i++){
            start=start.next;
        }

        ListNode endNode = head;
        for (int i = 1; i < size - k + 1; i++) {
            endNode = endNode.next;
        }
        
        int t = start.val;
        start.val = endNode.val;
        endNode.val = t;

        return head;

    }

}


