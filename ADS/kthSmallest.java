public class kthSmallest {
    //QuickSelectApproach
    public static void main(String[] args) {
        int[] arr={3,2,1,5,8};
        int k=3;
        System.out.println(findSmallest(arr, k));
        
    }
    public static int findSmallest(int[] arr, int k) {
        return quickSle(arr, 0, arr.length - 1, k - 1);
    }

    private static int quickSle(int[] arr, int left, int right, int k) {
        int pivotIndex = partition(arr, left, right);
        if (pivotIndex == k) {
            return arr[k];
        }
        else if (pivotIndex > k) {
            return quickSle(arr, left, pivotIndex - 1, k);
        } else {
            return quickSle(arr, pivotIndex + 1, right, k);
        }
    }


    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = (left);

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);

        return (i);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}