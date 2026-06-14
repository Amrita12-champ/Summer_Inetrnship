package Array;
public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = (high + low) / 2;
            
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
      
        int[] sortedNumbers = {10, 20, 30, 40, 50, 60, 70};
        int target = 40;
        
        int result = binarySearch(sortedNumbers, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}