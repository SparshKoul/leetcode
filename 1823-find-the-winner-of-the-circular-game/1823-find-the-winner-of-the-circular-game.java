class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> friends = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            friends.add(i);
        }

        int j = 0;
        while (friends.size() > 1) {

            j = (j + k - 1) % friends.size();
            friends.remove(j);

        }

        return friends.get(0);

    }
}