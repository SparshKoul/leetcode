class Solution {
    public String sorted(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
        //case senx B comoes before a
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        //key - sorted , value -list
        for(int i=0;i<strs.length;i++){
        String sortedstr = sorted(strs[i]);

        if (map.containsKey(sortedstr)) {
            map.get(sortedstr).add(strs[i]); //map.get(key) return value and it is arraylist
        } else {
            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);
            map.put(sortedstr, temp);
        }
        }
        List<List<String>> list = new ArrayList<>();
        for (var entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }
}