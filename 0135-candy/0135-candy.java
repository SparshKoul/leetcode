class Solution {
    public int candy(int[] ratings) {

        int n = ratings.length;

        int[] candies = new int[n];
        Arrays.fill(candies, 1); //min val 1


        //left -> right

        for(int i=1;i<n;i++){
            if(ratings[i] >ratings[i-1]){ //check left nfig only
                candies[i] =candies[i-1] +1;
            }
            //else 1 that is defined
        }


        //right->left
        int[] candies2 = new int[n];
        Arrays.fill(candies2, 1); //min val 1
        for(int i=n-2 ;i>=0;i--){

            if(ratings[i] > ratings[i+1]){
                candies2[i] =candies2[i+1] +1;
            }
            //else else cond defined 1;

        }

        //now sel maax of each ith by comparing;
        int [] x = new int [n];
        for(int i=0;i<n;i++){
            x[i] =Math.max(candies[i],candies2[i]);
        }


        int sum =0;
        for(int y:x){
            sum+=y;
        }
        return sum;


        
    }
}