class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String assumeprefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(assumeprefix)){
                assumeprefix=assumeprefix.substring(0,assumeprefix.length()-1);//prefix is getting short sholength too willbe
                if (assumeprefix.isEmpty()){
                    return "";
            }

            }

        }
        return assumeprefix;

    }
    }
