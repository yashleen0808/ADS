public class closestPairgfg {
    public static int[] findClosestPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int maxsum = 0;
        int[] result = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < target) {
                
                if (sum > maxsum) {
                    maxsum = sum;
                    result[0] = arr[left];
                    result[1] = arr[right];
                }
                left++; 
            } else {
                right--; 
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 4};
        int target = 10;

        int[] closestPair = findClosestPair(arr, target);

        System.out.println("["+closestPair[0] + ", " + closestPair[1] + "]");
    }
}
