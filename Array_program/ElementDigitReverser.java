package Array;

public class ElementDigitReverser {

    static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num = num / 10;
        }
        return reversed;
    }

    static int[] reverseElements(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = reverseNumber(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {23, 55, 57, 93, 1};
        int[] result = reverseElements(arr);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? "," : ""));
        }
        
    }
}