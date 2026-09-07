class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        StringBuilder sb =new StringBuilder();
        while( !map.isEmpty()){
            int maxfreq =Integer.MIN_VALUE;
            char maxchar= ' ';
            for(char num : map.keySet()){
                int freq=map.get(num);
                if(freq>maxfreq){
                    maxfreq=freq;
                    maxchar=num;
                }
                else if (freq ==maxfreq && num >maxchar){
                    maxchar=num;
                }
                
            }
            for(int i=0;i<maxfreq;i++){
                sb.append(maxchar);
            }
            map.remove(maxchar);
        }

        return sb.toString();
    }
}