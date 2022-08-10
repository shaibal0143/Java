import java.util.Scanner;

public class selectionsort {
    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of Elements you wnat to Enter::");
        int n = scan.nextInt();
        System.out.println("Enter the Elements::");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        // Selection sort
        // Time complexity=O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;

                }
            }
            // swapping
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        PrintArray(arr);
        scan.close();
    }
}
