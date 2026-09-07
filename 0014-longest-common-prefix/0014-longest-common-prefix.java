class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length ==0){
            return "";
        }
        String assumed=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(assumed)){
                assumed =assumed.substring(0,assumed.length()-1);
                if(assumed.length()==0){
                    return "";
                }

            }
            
            
        }
        return assumed;
        
    }
}