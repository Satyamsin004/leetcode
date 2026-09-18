class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int positivecount = 0;
        int negativecount = 0;

        for(int i=0;i<n;i++){
            int number = nums[i];
            if(number == 0){
                continue;
            }
            if(number < 0){
                negativecount++;
            }else{
                positivecount++;
            }
        }
        return Math.max(negativecount,positivecount);
    }
}