class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n+n];
        for(int i = 0, j = n; i < n; i++, j++){
            arr[i] = nums[i];
            arr[j] = nums[i];
        }
        return arr;
    }
}