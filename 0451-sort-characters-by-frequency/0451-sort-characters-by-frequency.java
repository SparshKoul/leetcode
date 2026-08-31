class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder sb =new StringBuilder();

        int k=0;
        while(!map.isEmpty()){
            int maxFreq = Integer.MIN_VALUE;
            char maxchar = ' ';

            for(char num : map.keySet()){

                int freq =map.get(num);
                if(freq> maxFreq){
                    maxFreq=freq;
                    maxchar=num;
                }
                else if(freq==maxFreq && num >maxchar){
                    maxchar=num;
                }

            }

            for(int i=0;i<maxFreq;i++){
                sb.append(maxchar);
            }
            map.remove(maxchar);
        }
        return sb.toString();
        
    }
}