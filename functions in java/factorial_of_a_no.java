
//Findind factorial of a number
import java.util.*;

public class factorial_of_a_no {
    public static void factorial(int n) {
        if (n < 0) {
            System.out.print("Invalid Input");
            return; 
        } 
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of the number is::" + fact);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number::");
        int n = scan.nextInt();
        factorial(n);
        scan.close();

    }
}
 
 
