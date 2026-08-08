class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> ans= new HashMap<>();
        for(int i : nums){
            ans.put(i,ans.getOrDefault(i,0)+1);
        } 
        int sum=0;
        for(Map.Entry<Integer,Integer> entry :ans.entrySet()){
            if(entry.getValue()==1){
                sum+=entry.getKey();
            }
        }
        return sum;
    }
}