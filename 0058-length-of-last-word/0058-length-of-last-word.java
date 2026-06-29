class Solution {
    public int lengthOfLastWord(String s) {

        String arr[] = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }

        int n = arr.length - 1;

        //trailing spaces
        while (n >= 0 && arr[n].equals(" ")) {
            n--;
        }

        String ans = "";

        while (n >= 0 && !arr[n].equals(" ")) {
            ans = arr[n] + ans;
            n--;
        }

        return ans.length();
    }
}