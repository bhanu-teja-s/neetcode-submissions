class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for(right = 0; right < s.length(); right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
            }
            else{
                while(s.charAt(right) != s.charAt(left)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
            result = Math.max(result, right-left+1);
        }
        return result;
    }
}