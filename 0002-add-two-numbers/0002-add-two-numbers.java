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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        while (temp1 != null || temp2 != null) {
            int sum = carry;

            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }
            int n = sum % 10;
            list.add(n);
            carry = sum / 10;

        }

        if (carry != 0) {
            list.add(carry);
        }

        ListNode dummy =new ListNode(-1);
        ListNode curr =dummy;
        for(int i=0;i<list.size();i++){
            curr.next = new ListNode(list.get(i));
            curr=curr.next;
        }
        return dummy.next;


    }
}