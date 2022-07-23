import java.util.*;

public class lastlevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int k = scan.nextInt();
            int n = scan.nextInt();
            int m = scan.nextInt();
            int t1 = k * n;
            int t2 = (k * n + k / 3 * m - m);
            int t3 = ((k * n) + (k / 3 * m));

            if (k <= 3) {
                System.out.println(t1);
            } else if (k % 3 == 0 && k > 5) {
                System.out.println(t2);
            } else {
                System.out.println(t3);
            }
        }
        scan.close();
    }

}
