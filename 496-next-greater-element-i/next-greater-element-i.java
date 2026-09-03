class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n];
        int i = 0;
        int k = 0;

        while (i < n) {
            int j = 0;
            while (j < m && nums1[i] != nums2[j]) {
                j++;
            }
            j++;

            while (j < m) {
                if (nums2[j] > nums1[i]) {
                    res[k] = nums2[j];
                    break;
                } else {
                    j++;
                }
            }
            if (j == m) {
                res[k] = -1;
            }
            i++;
            k++;

        }

        return res;

    }
}