class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String x =s+s;

        for(int i=0;i<x.length();i++){
            if(x.contains(goal)){

                return true;
            }
        }
        return false;
    }
}