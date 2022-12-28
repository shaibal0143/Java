
//Floyds Triangle
import java.util.*;

public class floyds_triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1;
        System.out.print("Enter the no.of rows:");
        int r = scan.nextInt(); 
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " "); 
                num++;

            }
            System.out.println(); 
        }
        scan.close();
    }

}
