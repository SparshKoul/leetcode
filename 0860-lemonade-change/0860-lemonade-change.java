class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n =bills.length;

        int five=0;
        int ten=0;

        for(int i=0;i<n;i++){
            if(bills[i] ==5){ //
                five++;
            }else if (bills[i] ==  10){  //we have to return 5$
                if(five ==0){
                    return false;
                }
                ten++;
                five--;
            }
            else{// 20 $ we go return 15 -> wither 10 ,5 or 5 5 5 
                if(ten >=1 && five>=1){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five=five-3;
                }else{
                    return false;
                }

            }
        }
        return true;
        
    }
}