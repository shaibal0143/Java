
//Inverted half Pyramid with numbers
import java.util.*;

public class inverted_half_pyramid_with_no {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no. of Row::");
        int r = scan.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scan.close();

    }
}
