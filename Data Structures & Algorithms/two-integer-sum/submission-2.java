class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int j = target - nums[i];
            if(set.containsKey(j)){
                return new int[] {set.get(j),i};
            }
            else{
                set.put(nums[i],i);
            }
        }
        return new int[] {};
    }
}
