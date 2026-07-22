class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }
        int maxfreq=0;
        for(int freq : map.values() ){
            maxfreq =Math.max(freq,maxfreq);
        }
        int sum =0;
        for(int freq : map.values() ){
            if(freq==maxfreq){
                sum+=freq;
            }
        }
        return sum;

    }
}