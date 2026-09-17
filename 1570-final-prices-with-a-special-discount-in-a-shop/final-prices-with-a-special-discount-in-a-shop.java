class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int j = i + 1;

            while (j < n) {
                if (prices[j] <= prices[i]) {
                    res[i] = prices[i] - prices[j];
                    break;
                } else {
                    j++;
                }
            }

            if (j == n) {
                res[i] = prices[i];
            }
        }

        return res;
    }
}