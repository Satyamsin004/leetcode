class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int pairscount = 0;
        int remaining = 0;
        for (int num : map.keySet()) {
            pairscount += map.get(num) / 2;
            remaining += map.get(num) % 2;

        }
        return new int[] { pairscount, remaining };

    }
}