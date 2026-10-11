class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                sum = nums[i];
            }else if(nums[i] > nums[i-1]){
                sum += nums[i];
            }else{
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}