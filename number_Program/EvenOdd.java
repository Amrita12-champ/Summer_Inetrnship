package number_Program;
import java.util.Scanner;

public class EvenOdd {
    static void checkEvenOdd(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        checkEvenOdd(num);

        sc.close();
    }
}