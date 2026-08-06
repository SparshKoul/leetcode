class Solution {
    public int smallestNumber(int n, int t) {

        while(prd(n) % t !=0){
            n++;
        }
        return n;
    }
    public int prd(int n){
        int prdd=1;
        while(n>0){
            int digit =n%10;
            prdd*=digit;
            n/=10;
        }
        return prdd;
    }
}