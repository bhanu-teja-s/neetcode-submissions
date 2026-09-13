class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        int high = j,low = i;
        while(high > low){
            int sum = numbers[i]+numbers[j];
            if(target == sum){
                break;
            }
            if(sum > target){
                j--;
            }
            if(sum < target){
                i++;
            }
        }
        return new int[]{i+1,j+1};
    }
}
