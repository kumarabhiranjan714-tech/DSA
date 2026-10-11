class Solution {
    public int maximumCount(int[] nums) {
        int pcount = 0;
        int ncount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ncount++;
            }
            else if(nums[i]>0){
                pcount++;
            }
        }

            return Math.max(pcount,ncount);
    }
}