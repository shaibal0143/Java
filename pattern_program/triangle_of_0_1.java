
//0 1 Triangle
import java.util.*;

public class triangle_of_0_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no.of rows:");
        int r = scan.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");

                }

            }
            System.out.println();
        }
        scan.close();
    }

}
