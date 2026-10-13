class Solution {
    public int leastInterval(char[] tasks, int n) {
        int len = tasks.length;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.addAll(map.values());

        int count = 0;
        int cycle = n + 1;

        while (!pq.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            int executed = 0;

            while (executed < cycle && !pq.isEmpty()) {
                int freq = pq.poll();
                freq--;

                if (freq > 0) {
                    temp.add(freq);
                }

                executed++;
            }

            for (int freq : temp) {
                pq.offer(freq);
            }

            if (pq.isEmpty()) {
                count += executed;
            } else {
                count += cycle;
            }
        }

        return count;
    }
}