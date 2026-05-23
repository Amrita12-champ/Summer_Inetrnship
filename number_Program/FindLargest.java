package number_Program;
public class FindLargest {
    public static void findLargest(int a, int b, int c) {

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number");
        }
        else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number");
        }
        else {
            System.out.println(c + " is the largest number");
        }
    }
    public static void main(String[] args) {

        findLargest(10, 25, 15);
    }
}
