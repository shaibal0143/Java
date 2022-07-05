//WAP to find the sum of all odd no. from 1 to n...

import java.util.*;

public class sum_of_all_odd_no {

    public static void sum(int num) {
        int sum1 = 0;

        for (int i = 0; i <= num; i++) {
            if ((i % 2) == 1) {
                sum1 = sum1 + i;
            }

        }
        System.out.println("The sum of all odd numbers is::" + sum1);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number::");
        int num = scan.nextInt();
        sum(num);

        scan.close();
    }

}
