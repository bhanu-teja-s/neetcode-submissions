    class Solution {
        public int maxArea(int[] heights) {
            int maxwater = 0;
            int i = 0; 
            int j = heights.length-1;
            while(i < j){
                int width = j-i;
                int height = Math.min(heights[i], heights[j]);
                int curr = width * height;
                maxwater = Math.max(maxwater, curr);
                if(height == heights[i]){
                    i++;
                }else{
                    j--;
                }
            }
            return maxwater;
        }
    }
