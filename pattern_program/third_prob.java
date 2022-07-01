//Inverted half Pyramid (Rotated by 180 degree)

import java.util.*;

class third_prob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the No. of Rows::");
        int r = scan.nextInt();

        // outer for loop
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        scan.close();

    }
}