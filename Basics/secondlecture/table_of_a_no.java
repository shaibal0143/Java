package secondlecture.java;

import java.util.*;

public class table_of_a_no {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number::");

        int a = scan.nextInt();

        System.out.println("The Number is::" + a);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * a);
        }
        scan.close();

    }

}
