class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //take 2 hashmaps store freq  
        //iterate through one to check if other key is oresent 
        //select the min then print those keys

        ArrayList<Integer> list = new ArrayList<>();


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }


        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
        }



        for (int x : map.keySet()) {

            if (map2.containsKey(x)) {
                int freq = map.get(x);
                int freq2 = map2.get(x);

                int count = Math.min(freq, freq2);

                for (int i = 0; i < count; i++) {
                    list.add(x);
                }

            }

        }
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;

    }
}