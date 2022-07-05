//Greater among Two numbers

import java.util.*;

public class greater_among_two {
    public static void greater_No(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(n1 + " is greater  ");
        } else if (n2 > n1) {
            System.out.println(n2 + " is greater  ");
        } else {
            System.out.println(n1 + " is equal to " + n2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st Number::");
        int n1 = scan.nextInt();
        System.out.print("Enter the 2nd Number::");
        int n2 = scan.nextInt();
        greater_No(n1, n2);

        scan.close();
    }

}
