class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] words = s.split("\\s+");
        Stack <String> st =new Stack<>();
        for(int i=0;i<words.length;i++){
            st.push(words[i]);
        }
        StringBuilder sb =new StringBuilder ();
        while(!st.isEmpty()){
            String x =st.pop();
            sb.append(x);
            if(!st.isEmpty()){
                sb.append(" ");
            }
                        
        }
        return sb.toString();
        
    }
}