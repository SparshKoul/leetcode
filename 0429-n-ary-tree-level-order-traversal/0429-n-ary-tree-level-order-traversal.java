/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    public int height(Node root) {
        if (root == null) {
            return 0;
        }

        int maxHeight = 0;

        for (Node child : root.children) {
            maxHeight = Math.max(maxHeight, height(child));
        }

        return maxHeight + 1;
    }

    public void printLevel(Node root, int level, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        if (level == 1) {
            arr.add(root.val);
            return;
        }

        for (Node child : root.children) {
            printLevel(child, level - 1, arr);
        }
    }

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> ans = new ArrayList<>();

        int h = height(root);

        for (int i = 1; i <= h; i++) {
            ArrayList<Integer> arr = new ArrayList<>();

            printLevel(root, i, arr);

            ans.add(arr);
        }

        return ans;
    }
}