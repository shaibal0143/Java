
//wap to check the no. is prime or not
import java.util.*;

public class prime_or_not {
    public static void primecheck(int n) {
        if (isPrime(n)) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is a non-prime number");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number::");
        int n = scan.nextInt();
        primecheck(n);
        scan.close();
    }

}
