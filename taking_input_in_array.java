
//WAP to take user defined inputs in array
import java.util.*;

public class taking_input_in_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array::"); 
        int size = scan.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the name::");
            names[i] = scan.next();

        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("The Name is::" + names[i]);
        }

        scan.close();

    }

}
