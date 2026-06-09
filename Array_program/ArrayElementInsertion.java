public class ArrayElementInsertion {

    static int[] insertAtIndex(int[] arr, int element, int index) {
        int[] result = new int[arr.length + 1];
    
        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }
        result[index] = element;
        
        for (int i = index; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int element = 5;
        int index = 3;
        int[] result = insertAtIndex(arr, element, index);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? "," : ""));
        }
    }
}