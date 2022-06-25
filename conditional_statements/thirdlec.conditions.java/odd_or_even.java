
import java.util.*;

public class odd_or_even {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number::");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + ":This number is Even" + num);

        } else {

            System.out.println(num + ":This is a odd number");
        }
        scan.close();

    }
}