public class MissingNumber {
    public static int findMN(int[]arr,int n){
        int expSum= n*(n+1)/2;
        int actualsum=0;
        for(int num:arr){
            actualsum+=num;
        }
        return expSum-actualsum;

    }
    
}
