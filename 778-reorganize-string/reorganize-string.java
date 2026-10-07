class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();
        char prev = ' ';

        while(!pq.isEmpty()){
            char current = pq.poll();
            ans.append(current);
            map.put(current,map.get(current) - 1);
            if( prev != ' ' && map.get(prev) > 0){
                pq.offer(prev);
            }
            prev = current;
        }
        if(ans.length() == s.length()){
            return ans.toString();
        }
        return "";

        
    }
}