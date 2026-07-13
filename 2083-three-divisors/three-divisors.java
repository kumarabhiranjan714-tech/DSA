class Solution {
    public boolean isThree(int n) {
         int divisor_count = 0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                divisor_count = divisor_count+1;
            }
        }
        
        if(divisor_count==3){
            return true;
        }
        return false;
    }
}