class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        
        int i = 0;
        int j = s.length()-1;
        int size = s.length()/2;
        while(i != size){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
