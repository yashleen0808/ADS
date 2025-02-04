class Solution {
    public int minStartValue(int[] nums) {
        int min=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<min){
            min=sum;
            }
        }
        
        if(min<0){
            return 1+(-(min));
        }
        return 1;
    }
}