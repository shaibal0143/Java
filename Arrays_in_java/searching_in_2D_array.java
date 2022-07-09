
//WAP to search an element in 2D array
import java.util.*;

public class searching_in_2D_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enetr the no. of rows::");
        int row = scan.nextInt();
        System.out.print("Enter the no. of columns::");
        int col = scan.nextInt();
        int num[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the elements::");
                num[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num[i][j] + " ");

            }
            System.out.println();
        }
        System.out.print("Enter the Element to Search::");
        int x = scan.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (num[i][j] == x) {
                    System.out.println("Element found in: " + i + " " + j + " position");
                }
            }
        }
        scan.close();

    }
}
