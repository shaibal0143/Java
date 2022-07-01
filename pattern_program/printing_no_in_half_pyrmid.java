//printing number in half pyramid

import java.util.*;

public class printing_no_in_half_pyrmid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no.of rows::");
        int r = scan.nextInt();
        // System.out.println("Enter the no.of Columns::");
        // int c = scan.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scan.close();
    }

}
