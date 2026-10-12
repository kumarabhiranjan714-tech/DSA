


class Solution {
    public int missingNumber(int[] nums) {
    int sum =0;
    
    int max=0;
    
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            if(nums[i]>max){
                max = nums[i];
            }
            
        }
        int n = nums.length;
        int actualsum = (n*(n+1))/2;
        
        return actualsum -sum;
        }
}
