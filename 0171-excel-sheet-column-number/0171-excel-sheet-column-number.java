class Solution {
    public int titleToNumber(String str) {
        int result=0;
        for(int i=0;i< str.length();i++){
            char ch=str.charAt(i);
            int x= ch- 'A' +1;
            result = result*26 + x;
        }
        return result;
    }
}