
//comparing 2 strings
 import java.util.*;

 public class comparing_of_2_strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your 1st string::");
        String name1 = scan.nextLine();
        System.out.print("Enter your 2nd String::");
        String name2 = scan.nextLine();

        // use of compareTo function
        // s1>s2=+ve value
        // s1=s2==0
        // s2>s1=-ve value

        if (name1.compareTo(name2) == 0) {
            System.out.println("Same inputs::");
        } else {
            System.out.println("Different inputs::");
        }
        scan.close();
    }

}
