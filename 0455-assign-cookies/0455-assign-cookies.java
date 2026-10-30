class Solution {
    public int findContentChildren(int[] greed, int[] cookie) {
        int g = greed.length;
        int c =cookie.length;

        int left=0; //greed
        int right =0; //cookie ptr
        Arrays.sort(greed);
        Arrays.sort(cookie);

        int count=0;
        while(left<g && right <c){
            if(cookie[right] >= greed[left]){ // cookie is abe to satisfy greed of kid
            count++;
            left++;
            right++;
            }
            else{ //try bigger cookie
                right++;
            }
        }

        return count;
        
    }
}