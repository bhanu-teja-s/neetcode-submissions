class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int arr2[] = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
            int currmax = arr[i];
            arr2[i] = max;
            max = Math.max(currmax,max);
        }
        return arr2;
    }
}