class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!= t.length()){
            return false;

        }
        HashMap<Character, Character> maps =new HashMap<>();
        HashMap<Character, Character> mapt =new HashMap<>();


        for(int i=0;i<s.length();i++){
            char a =s.charAt(i);
            char b =t.charAt(i);
            if(maps.containsKey(a) && maps.get(a) !=b){
                return false;
            }
            if(mapt.containsKey(b) && mapt.get(b) !=a){
                return false;
            }

            maps.put(a,b);
            mapt.put(b,a);
        }
        return true;
    }
}