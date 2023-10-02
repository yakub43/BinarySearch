// Find the Greatest Number Smaller than or equal to a target

public class CeilOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = getCeil(arr, target);
        System.out.println(ans);
    }

    public static int getCeil(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end -start)/2;

            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}
