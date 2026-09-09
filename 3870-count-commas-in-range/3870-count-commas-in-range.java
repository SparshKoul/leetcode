class Solution {
    public int countCommas(int n) {
        int com=0;
        if(n>999 && n<=100000){
            com=n-1000+1;
        }

        if(n<1000 || n>100000){
            return 0;
        }
        return com;
    }
}