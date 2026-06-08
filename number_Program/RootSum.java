package Array;

public class RootSum {

    static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }

    static int getSingleDigit(int num) {
        while (num > 9) {
            num = sumDigits(num);
        }
        return num;
    }

    static int[] processSingleDigits(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = getSingleDigit(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {23, 55, 57, 93, 10, 1};
        int[] result = processSingleDigits(arr);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? "," : ""));
        }
       
    }
}