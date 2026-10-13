class Solution {
    public int scoreOfString(String s) {
        int a = (int) s.charAt(0);
        int b;
        int result = 0;
        for(int i = 1; i < s.length(); i++){
            b = (int) s.charAt(i);
            result = result + Math.abs(b - a);
            a = b;
        }
        return result;
    }
}