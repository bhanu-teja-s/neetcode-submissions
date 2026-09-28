class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Integer> stack = new Stack<Integer>();

        int n = position.length;
        double arr[][] = new double[n][2];
        for(int i = 0; i < n; i++ ){
            arr[i][0] = position[i];
            arr[i][1] = (double)(target - position[i]) / speed[i];
        }
        Arrays.sort(arr, (a,b) -> Double.compare(a[0], b[0]));
        //For Descending Order
        //Arrays.sort(arr, (a,b) -> Double.compare(b[0], a[0]));
        
        int count = 0;
        double prev = 0;
        for(int i = n-1; i >= 0; i--){
            double[] car = arr[i];
            if(car[1] > prev){
                count++;
                prev = car[1];
            }
        }
        return count;
    }
}
