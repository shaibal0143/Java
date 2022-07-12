
//concatenation ,printing length and printing individual character of the string
import java.util.*;

public class prop_of_strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first name::");
        String firstname = scan.nextLine();
        System.out.print("Enter your last name::");
        String secondname = scan.nextLine();

        // concatenate
        String fullname = firstname + " " + secondname;
        System.out.println("Your name is::" + fullname);

        // Printing length of the string
        System.out.println("The length of the string is:" + fullname.length());

        // printing individual character of the string using charAt function
        for (int i = 0; i <= fullname.length(); i++) {
            System.out.println(fullname.charAt(i));

        }
        scan.close();

    }

}
