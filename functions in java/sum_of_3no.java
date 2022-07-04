//Average of 3 number

import java.util.*;

public class sum_of_3no {
    public static void average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println("The Average of Three Number is:: " + avg);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st number::");
        int a = scan.nextInt();
        System.out.print("Enter the 2nd Number::");
        int b = scan.nextInt();
        System.out.print("Enter the 3rd Number:: ");
        int c = scan.nextInt();
        average(a, b, c);
        scan.close();

    }
}
