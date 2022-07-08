
//WAP to check the array is sorted or not....
import java.util.*;

public class sorted_or_not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array::");
        int size = scan.nextInt();
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the Numbers::");
            number[i] = scan.nextInt();

        }
        boolean isascending = true;
        for (int i = 0; i < number.length - 1; i++) {
            // for decending order checking
            if (number[i] > number[i + 1]) {
                isascending = false;

            }
        }
        if (isascending) {

            System.out.println("The array is sorted in ascending order");

        } else {
            System.out.println("The array is either in decending order or not sorted properly.");

        }
        scan.close();
    }

}
