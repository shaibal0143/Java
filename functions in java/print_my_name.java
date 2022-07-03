
//printing my name using function
import java.util.*;

public class print_my_name {
    public static void printMyName(String name) {
        System.out.println("Your name is::" + name);
        return;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name::");
        String name = scan.nextLine();
        printMyName(name);
        scan.close();
    }

}
