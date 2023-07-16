package javaProgram.array_revise;

import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of the Array::");
        int n = scan.nextInt();
        String name[] = new String[n];
        // System.out.print( "-Enter your name::");
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + "-Enter your name::");
            name[i] = scan.next();

        }
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "-The name is::" + name[i]);

        }
        scan.close();

    }

}
