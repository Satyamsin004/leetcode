class Solution {
    public int rearrangeCharacters(String s, String target) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> targetmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);
            if (targetmap.containsKey(ch)) {
                targetmap.put(ch, targetmap.get(ch) + 1);
            } else {
                targetmap.put(ch, 1);
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<target.length();i++){
            char ch = target.charAt(i);
            int available = map.getOrDefault(ch, 0);
            int required = targetmap.get(ch);

            ans = Math.min(ans, available / required);
        }
        return ans;

    }
}