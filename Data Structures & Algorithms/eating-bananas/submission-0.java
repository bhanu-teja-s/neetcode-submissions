class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int right = 1;
        int left = 1;
        for(int i = 0; i < piles.length; i++){
            right = Math.max(right, piles[i]);
        }
        while(left < right){
            int mid = left + (right - left) / 2;
            if(possible(mid, piles, h)){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
    public boolean possible(int mid, int[] piles, int h){
        int hours = 0;
        for(int i = 0; i < piles.length; i++){
            hours += Math.ceil((double) piles[i] / mid);
        }
        return hours <= h;
    }
}
