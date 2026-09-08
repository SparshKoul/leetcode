class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int ans=0;
        for(char ch :s.toCharArray()){
            if(ch=='('){
                depth++;
                ans=Math.max(depth,ans);
            }
            else if (ch==')'){
                depth--;
            }
        }
        return ans;
        
    }
}