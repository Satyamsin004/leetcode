class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int ans = Integer.MAX_VALUE;

        ans = Math.min(ans, map.getOrDefault('b', 0));
        ans = Math.min(ans, map.getOrDefault('a', 0));
        ans = Math.min(ans, map.getOrDefault('l', 0) / 2);
        ans = Math.min(ans, map.getOrDefault('o', 0) / 2);
        ans = Math.min(ans, map.getOrDefault('n', 0));

        return ans;

    }
}