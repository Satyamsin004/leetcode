class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n = words.length;
        HashMap<String, Integer> map = new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<>( (a,b) ->{
            if(!map.get(a).equals(map.get(b))){
                return map.get(a) - map.get(b);
            }
            return b.compareTo(a); 
        });
        for(int i = 0;i<n;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(String word : map.keySet()){
            pq.add(word);
            if(pq.size() > k){
                pq.poll();
            }
        }
        ArrayList<String>List = new ArrayList<>();
        int size = pq.size();
        for(int i = 0;i<size;i++){
            List.add(pq.poll());
        }
           Collections.reverse(List);
        return List;

        
    }
}