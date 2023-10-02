// leetcode - https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class NextGreatestLetter {
    public static void main(String[] args) {

    }
    public static char nextGreatestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        if(arr[end] < target){
            return arr[start];
        }

        while (start <= end){
            int mid = start + (end -start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
