// class Solution {
//     public int singleNumber(int[] nums) {
//         int count =0;
//         int i =1;
//         int j = nums.length;
//         while(i<=j){
//             if(nums[i-1]==nums[i]){
//                 i++;
//                 j--;
//             }else{
//                 count=nums[i];
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int singleNumber(int[] nums) {
            int a =0;
        for(int i =0;i<nums.length;i++){
             a = nums[i]^a;
        }
        return a;
    }
}