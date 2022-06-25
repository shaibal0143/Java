import java.util.*;

public class menu_driven {
    public static void main(String[] srgs) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 for giving input\nEnter 0 for exit");
        int i = scan.nextInt();
        switch (i) {
            case 1:
                System.out.println("Enter the Marks ::");
                int marks = scan.nextInt();
                if (marks >= 90) {
                    System.out.println("This is good..");
                } else if (marks >= 69 && marks <= 89) {
                    System.out.println("This is also good..");
                } else if (marks >= 39 && marks <= 69) {
                    System.out.println("Have to work hard...");
                }
                break;
            case 0:
                System.out.println("Exit from the program...");

        }
        scan.close();
    }
}
