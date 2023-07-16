package javaProgram.array_revise;

import java.util.*;

public class searching_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the Numbers::");
        for (int i = 0; i < n; i++) {

            num[i] = sc.nextInt();

        }
        System.out.println("Enter the Number For searching::");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (x == num[i]) {
                System.out.println("The number is found at " + i + 1 + " th place");
            }

        }

        sc.close();

    }

}
