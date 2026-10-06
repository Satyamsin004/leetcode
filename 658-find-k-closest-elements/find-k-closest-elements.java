class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int n = arr.length;

        int low = 0;
        int high = n - k;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (x - arr[mid] > arr[mid + k] - x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = low; i < low + k; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
}