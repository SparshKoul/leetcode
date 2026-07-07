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
    public ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return null;
        }

        ArrayList<ListNode> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        ListNode curr = list.get(0);

        // Odd posit 1st, 3, 5...
        for (int i = 2; i < list.size(); i += 2) {
            curr.next = list.get(i);
            curr = curr.next;
        }

        // Even pos: 2, 4, 6...
        for (int i = 1; i < list.size(); i += 2) {
            curr.next = list.get(i);
            curr = curr.next;
        }

        curr.next = null;

        return list.get(0);
    }
}