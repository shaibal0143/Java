
//Half Pyramid Problem
import java.util.*;

public class inverted_half_pyramid {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no.of rows::");
        int r = scan.nextInt();
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }

}
