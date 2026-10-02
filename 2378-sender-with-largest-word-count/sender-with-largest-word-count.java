class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        int n = messages.length;
        int m = senders.length;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < messages[i].length(); j++) { 
           // int words = messages[i].split(" ").length;
                if (messages[i].charAt(j) == ' ') {
                    count++;
                }
            }
            map.put(senders[i],map.getOrDefault(senders[i],0)+count);
        }
        int max = 0;
        String ans = " ";
        for(String sender : map.keySet()){
            int count = map.get(sender);
            if(count > max){
                max = count ;
                ans = sender;
            }else if( count == max && sender.compareTo(ans) > 0){
                ans = sender;
            }
        }
        return ans;

    }
}