public class max{
    public static void main(String[] args) {
        int arr[]={5,4,3,6,7,8,2,1};
        int m=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        System.out.println("Maximum element is:"+m);
    }
}