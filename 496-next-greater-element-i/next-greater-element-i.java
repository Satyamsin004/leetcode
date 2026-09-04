class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums2.length;
        st.push(nums2[0]);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                map.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }
        int m = nums1.length;
        int[] res = new int[m];
        
        for(int i = 0;i<m;i++){
            res[i] = map.get(nums1[i]);
        }
     return res;
    }
}