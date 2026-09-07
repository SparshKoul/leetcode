class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0;i<t.length();i++){
            char x =t.charAt(i);
            if(!map.containsKey(x)){
                return false;
            }
            map.put(x,map.get(x)-1);

            if(map.get(x) ==0){
                map.remove(x);
            }
        }
        return true;
    }
}