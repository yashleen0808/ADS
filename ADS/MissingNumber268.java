public class MissingNumber268 {
    class Solution {
        public int missingNumber(int[] nums) {
            int n= nums.length;
            int expSum= n*(n+1)/2;
            int actualsum=0;
            for(int num:nums){
                actualsum+=num;
            }
            return expSum-actualsum;
    
        }
            
        
    }
    
}
