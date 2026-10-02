class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(int i = 0; i < heights.length; i++){
            int curr = heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] > heights[i]){
                int height = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = i - left - 1;
                result = Math.max(result, height * width);
            }
            stack.push(i);
        }
        int i = heights.length;
        while(!stack.isEmpty()){
            int height = heights[stack.pop()];
            int left = stack.isEmpty() ? -1 : stack.peek();
            int width = i - left - 1;
            result = Math.max(result, height * width);
        }
        return result;
    }
}
//men are not really two faced its how their charac or personality they behave with their mates and diff with girls.
//there do exist 2 faced people which is bad