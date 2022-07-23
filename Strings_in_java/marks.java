
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int k = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(k - n);
        }
        scan.close();
    }

}
