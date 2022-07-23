import java.util.Scanner;

public class fair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            if (k > n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scan.close();
    }
}