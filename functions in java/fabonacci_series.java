
//WAP to print Fabonacci series
import java.util.*;

public class fabonacci_series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the nth term::");
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();

        }
        scan.close();

    }

}
