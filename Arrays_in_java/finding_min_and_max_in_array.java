
//FInding mininmum and maximunm value in an array... 
import java.util.*;

public class finding_min_and_max_in_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array::");
        int size = scan.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number::");
            numbers[i] = scan.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];

            }
            if (numbers[i] > max) {
                max = numbers[i];

            }
        }
        System.out.println("The largest number in the array is:" + max);
        System.out.println("The smallest number in the array is::" + min);

        scan.close();

    }

}
