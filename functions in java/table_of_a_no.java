
//wap to print Table Of a number..
import java.util.*;

public class table_of_a_no {
    public static void table(int n) {

        for (int i = 1; i <= 10; i++) {
            int num = n * i;
            System.out.println(num);

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number::");
        int n = scan.nextInt();
        table(n);
        scan.close();
    }

}
