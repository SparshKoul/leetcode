class Solution {
    public int findContentChildren(int[] greed, int[] cookie) {
        int g = greed.length;
        int c = cookie.length;

        Arrays.sort(greed);
        Arrays.sort(cookie);

        int left = 0;  // Child 
        int right = 0; // Cookieee 
        int count = 0;

        while (left < g && right < c) {

            if (cookie[right] >= greed[left]) {//satisy kid
                count++;
                left++;
                right++;
            } else {
                right++; // not satisy try bigger cookie
            }
        }

        return count;
    }
}