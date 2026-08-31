class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            if(nums[i] %2 == 0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }


        
        while(!map.isEmpty()){
            int maxfreq=Integer.MIN_VALUE;
            int maxnum=-1;

            for(int num: map.keySet()){
                int freq = map.get(num);

                if(freq >maxfreq){
                    maxfreq=freq;
                    maxnum=num;
                }
                else if(freq == maxfreq && num < maxnum){
                    maxnum=num;

                }
            }
            return maxnum;

        }
        return -1;
        
    }
}