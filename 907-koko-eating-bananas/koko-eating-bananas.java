class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = 0;
        for(int i= 0;i<n;i++){
            high = Math.max(high,piles[i]);
        }
        while(high > low){
            int mid = low + (high -low)/2;
            int hours = 0;
            for(int i = 0;i<n;i++){
                if(piles[i] % mid == 0){
                    hours += piles[i] / mid;
                }else{
                    hours += (piles[i] / mid) + 1;
                }
            }
            if(hours <= h){
                high= mid;
            }else{
                low = mid+1;
            }
        }
        return low;
        
    }
}