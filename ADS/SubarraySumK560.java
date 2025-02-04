import java.util.HashMap;

public class SubarraySumK560 {
    class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> sumFreq= new HashMap<>();
        sumFreq.put(0,1);
        int curSum=0;
        int count=0;
        for(int num:nums){
            curSum+=num;
            if(sumFreq.containsKey(curSum-k)){
                count+=sumFreq.get(curSum-k);
            }
            sumFreq.put(curSum,sumFreq.getOrDefault(curSum,0)+1);
        }
        return count;
        
    }
}
    
}
