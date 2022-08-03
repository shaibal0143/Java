
//solid Rhombus 
import java.util.*;

public class solid_rhombus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no. of rows::");
        int r = scan.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i + 1; j++) {
                System.out.print(" ");
             }
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
            }
            System.out.println();

            scan.close();
        }

    }
}
