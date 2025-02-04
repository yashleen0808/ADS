class Sumofabsolutediff1685{
    public static int[] getSumAbsoluteDifferences(int[] nums) {
                int n= nums.length;
                int[] result= new int[n];
                int L=0;
                int R=0;
                for(int num:nums){
                    R+=num;
                }
                for(int i=0;i<n;i++){
                    R=R-nums[i];
                    result[i]= (nums[i]*i-L)+(R-nums[i]*(n-i-1));
                    L+=nums[i];
                }
                return result;
                
            }
        }
    
     
    