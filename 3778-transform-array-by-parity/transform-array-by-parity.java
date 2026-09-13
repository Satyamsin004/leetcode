class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            nums[i] = 0;
        }
        for (int i = count; i < n; i++) {
            nums[i] = 1;
        }
        return nums;

    }
}