class Solution {
    public int countPairs(int[] deliciousness) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        long count = 0;

        for (int i = 0; i < deliciousness.length; i++) {

            int x = deliciousness[i];

            for (int power = 1; power <= 2097152; power = power * 2) {

                int needed = power - x;

                count += freq.getOrDefault(needed, 0);
            }

            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        return (int) (count % 1000000007);
    }
}