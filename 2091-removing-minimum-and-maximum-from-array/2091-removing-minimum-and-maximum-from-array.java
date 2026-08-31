class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minf=-1;
        int maxf=-1;

        int min =Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                minf =i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxf =i;
            }
        }

        int a = Math.min(minf, maxf);
        int b =Math.max(minf,maxf);

        int front = b + 1;
        int back = n - a;
        int both = (a + 1) + (n - b);

        return Math.min(front, Math.min(back, both));
    }
}