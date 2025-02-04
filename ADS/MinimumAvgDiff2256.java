class Solution {
    public int minimumAverageDifference(int[] nums) {
        int index=0;
        int n=nums.length;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        long L=0;
        long R=0;
        long min= Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            long a=0;
            L+=nums[i];
            R=sum-L;
            a=Math.abs((L/(i+1))-(n-i==1?0:R/(n-i-1)));
            if(a<min){
                min=a;
                index=i;
            }
        
        }   
        return index;
    }
}

            
        