/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
import java.util.HashMap;
import java.util.Map;

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Map<Node, Node> map = new HashMap<>();

         
        Node temp = head;
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        // connect next and random of the copies
        temp = head;
        while (temp != null) {
            Node copyNode = map.get(temp);
            copyNode.next = map.get(temp.next);      
            copyNode.random = map.get(temp.random);  
            temp = temp.next;
        }

        return map.get(head);
    }
}
