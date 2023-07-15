package javaProgram.array_revise;

import java.util.Scanner;

public class array_1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array--");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Numbers--");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

        }
        System.out.print("The array is--");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        scan.close();
    }

}
