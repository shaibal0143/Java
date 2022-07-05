
//WAP to count all positive ,negative and zeros entered by the user
import java.util.*;

public class counting_of_no {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice\n1-To continue \n2-To stop");
        int choice = scan.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        while (choice == 1) {
            System.out.println("Enter an integer::");
            int n = scan.nextInt();
            if (n > 0) {
                positive = positive + 1;
            } else if (n < 0) {
                negative = negative + 1;
            } else if (n == 0) {
                zero = zero + 1;
            }
            System.out.println("Enter your choice\n1-To continue \n2-To stop");
            choice = scan.nextInt();

        }
        System.out.println("positive numbers are:" + positive);
        System.out.println("Negative numbers are:" + negative);
        System.out.println("no.of zeros are:" + zero);
        scan.close();

    }

}
