
//wap to check the no. is Even or not
import java.util.*;

public class even_or_not {
    public static void evencheck(int n) {

        if (n % 2 == 0) {
            System.out.println("It is a Even number..");
            return;
        } else {
            System.out.println("It is a odd number..");
            return;

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number::");
        int n = scan.nextInt();
        evencheck(n);
        scan.close();
    }

}
