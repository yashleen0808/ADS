public class RecursionIntro {
    //Recursion is a method in which a function calls itself
    //to solve a smaller instances of the same problem
    //types of recursion
    //direct recursion: a function calls itself
    //indirect recursion: A function calls another function
    //Tail recursion
    //Head recursion
    //find the position of target element 
    public static int binarySearch(int[] arr, int target, int left, int right){
        if(left>right){
            return -1;

        }
        int mid= left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarySearch(arr,target,left,mid-1);
        }
        else{
            return binarySearch(arr,target,mid+1,right);
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=9;
        int index=binarySearch(arr,target,0,arr.length-1);
        System.out.println(index);
    }
    
}
