class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int ans [] = new int [k];
        int pos=0;
        while(pos<k){
            int maxfreq =Integer.MIN_VALUE;
            int maxnum =Integer.MIN_VALUE;
            for(int num :map.keySet()){
                int freq = map.get(num);
                if(freq>maxfreq){
                    maxfreq=freq;
                    maxnum=num;
                }

            }
            ans[pos] = maxnum;
            pos++;
            map.remove(maxnum);
        }
        return ans;
    }
}