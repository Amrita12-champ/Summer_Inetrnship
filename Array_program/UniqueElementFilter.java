package Array;
public class UniqueElementFilter {

    static int getFrequency(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        return count;
    }

    static int countStrictlyUnique(int[] arr) {
        int countUnique = 0;
        for (int i = 0; i < arr.length; i++) {
            if (getFrequency(arr, arr[i]) == 1) {
                countUnique++;
            }
        }
        return countUnique;
    }

    static int[] removeDuplicatesCompletely(int[] arr) {
        int uniqueSize = countStrictlyUnique(arr);
        int[] result = new int[uniqueSize];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (getFrequency(arr, arr[i]) == 1) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4};
        int[] result = removeDuplicatesCompletely(arr);
      
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? "," : ""));
        }
       
    }
}