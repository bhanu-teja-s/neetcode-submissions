class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }

        int a = s.length();
        int j = 0;
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
            if(j == a){
                return true;
            }
        }
        return false;
    }
}