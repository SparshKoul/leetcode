class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        List<String> list = new ArrayList<>();

        for (int j = 0; j < k; j++) {
            int maxfreq = Integer.MIN_VALUE;
            String maxstr = "";

            for (String x : map.keySet()) {
                int freq = map.get(x);

                if (freq > maxfreq ||
                        (freq == maxfreq && x.compareTo(maxstr) < 0)) {
                    maxfreq = freq;
                    maxstr = x;
                }
            }

            list.add(maxstr);
            map.remove(maxstr);
        }
        //Collections.sort(list);

        return list;
    }
}