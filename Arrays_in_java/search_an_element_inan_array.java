
//WAP to search an element int the array
import java.util.*;

public class search_an_element_inan_array {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array::");
        int size = scan.nextInt();
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Element::");
            num[i] = scan.nextInt();
        }
        System.out.println("Enter the element to search::");
        int x = scan.nextInt();
        for (int i = 0; i <= num.length; i++) {
            if (num[i] == x) {
                System.out.println("Element found in " + i + " position");
            }
        }
        scan.close();

    }

}
