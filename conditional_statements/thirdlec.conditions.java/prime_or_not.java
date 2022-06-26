import java.util.*;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter  an  integer::");
        int num = scan.nextInt();
        boolean flag = false;
        // checking for nonprime no
        for (int i = 2; i <= num / 2; i++) {
            if (num % 2 == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("This is a prime no...");
        else
            System.out.println("Not a prime no..");

        scan.close();

    }

}
