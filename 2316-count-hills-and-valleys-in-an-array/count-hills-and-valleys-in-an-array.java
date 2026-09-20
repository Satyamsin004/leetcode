class Solution {  
    public int countHillValley(int[] nums) {  
        int n = nums.length;  
        int hill = 0;  
        int valley = 0;  
  
        for(int i = 1; i < n - 1; i++){  

            int left = nums[i - 1];

            if(nums[i] == nums[i + 1]) { 
                while(i < n - 1 && nums[i] == nums[i + 1]) { 
                    i++; 
                } 
            }

            if(i == n - 1) {
                break;
            }

            if(nums[i] > left && nums[i] > nums[i + 1]) {  
                hill++;  
            }   
             
            if(nums[i] < left && nums[i] < nums[i + 1]) {  
                valley++;  
            }  
        }  
  
        return hill + valley;  
    }  
}