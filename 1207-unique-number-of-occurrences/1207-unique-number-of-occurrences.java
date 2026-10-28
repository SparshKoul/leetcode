class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        


        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }


        HashSet<Integer> set = new HashSet<>();
        for(int num:countMap.values()){
            set.add(num);
        }

        return countMap.size()==set.size();
    }
}