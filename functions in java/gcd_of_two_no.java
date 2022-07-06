
//WAP to findt he greatest common divisor of 2  nos. 
import java.util.*;

public class gcd_of_two_no {
    public static void gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;

            } else {
                b = b - a;

            }

        }
        System.out.print("GCD is:" + b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st number::");

        int a = scan.nextInt();
        System.out.print("Enter the 2nd number::");
        int b = scan.nextInt();
        gcd(a, b);
        scan.close();
    }

}
