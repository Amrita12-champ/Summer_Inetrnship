public class ArrayElementDeletion {

    static int[] deleteAtIndex(int[] arr, int index) {
        int[] result = new int[arr.length - 1];
        
        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }
     
        for (int i = index; i < result.length; i++) {
            result[i] = arr[i + 1];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int index = 2; // Deleting element at index 2 (value 3)
        int[] result = deleteAtIndex(arr, index);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? "," : ""));
        }
    }
}