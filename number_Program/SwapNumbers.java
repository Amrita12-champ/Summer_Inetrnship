package number_Program;
public class SwapNumbers {
    public static void swapNumbers(int a, int b) {
        int temp;
        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        swapNumbers(5, 10);
    }
}