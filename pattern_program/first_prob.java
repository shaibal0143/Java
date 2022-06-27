
//solid rectangle problem
import java.util.*;

public class first_prob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows::");
        int r = scan.nextInt();
        System.out.print("Enter the number of Columns::");
        int c = scan.nextInt();
        // outer loop
        for (int i = 1; i <= r; i++) {
            // inner loop
            for (int j = 1; j <= c; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        scan.close();

    }

}
