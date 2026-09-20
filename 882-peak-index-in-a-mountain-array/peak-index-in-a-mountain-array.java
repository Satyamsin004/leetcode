class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(high>=low){
            int mid = low + (high - low)/2;
            if(arr[mid] > arr[mid+1]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
        
    }
}