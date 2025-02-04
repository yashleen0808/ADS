public class RemoveDuplicates26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int index =0;
            for(int i =1;i<nums.length;i++){
                if(nums[i]!=nums[index]){
                    index++;
                    nums[index]=nums[i];
                }
            }
            return ++index;
        }
    }
    
}
