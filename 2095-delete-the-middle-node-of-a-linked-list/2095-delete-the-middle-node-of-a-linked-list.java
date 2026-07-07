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

    public ListNode findmid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next.next;//slow aat 1t half end se 1ek pehle

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode mid = findmid(head); //at 1st hhlaf seconf last
        mid.next = mid.next.next;
        return head;
    }

}
//odd k liye slow at is hald k second last like 2 for 12345
//even it normal 2 for 1234