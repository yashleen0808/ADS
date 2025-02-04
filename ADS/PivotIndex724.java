public class PivotIndex724 {
        public int pivotIndex(int[] nums) {
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum= sum+nums[i];
            }
            int leftsum=0;
            for(int i=0;i<nums.length;i++){
                if(leftsum == sum-leftsum-nums[i]){
                    return i;
                }
                leftsum+=nums[i];
                
                }
            return -1;
        }
    }
    

