public class RangeSumQuery303 {
    class NumArray {
        private int[] Sum;
    
        public NumArray(int[] nums) {
            Sum= new int[nums.length+1];
            for(int i=0;i<nums.length;i++){
                Sum[i+1]=Sum[i]+nums[i];
            }
        }
        
        public int sumRange(int left, int right) {
            
            return Sum[right+1]-Sum[left];
        }
    }
}
