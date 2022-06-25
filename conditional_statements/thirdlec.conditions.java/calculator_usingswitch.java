import java.util.*;

public class calculator_usingswitch {

    public static void main(String[] args) {
        int sum;
        int diff;
        int mul;
        int div;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the the 1st Number::");
        int a = scan.nextInt();
        System.out.println("Enter the 2nd Number::");
        int b = scan.nextInt();
        System.out.println("Enter your choice:\n1-addition\n2=Subtraction\n3-Multliplication\n4=Division");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                sum = (a + b);
                System.out.println("The sum is :" + sum);
                break;
            case 2:
                diff = (a - b);
                System.out.println("The difference is :" + diff);
                break;
            case 3:
                mul = (a * b);
                break;
            case 4:
                div = (a / b);
                System.out.println("The Value is ::" + div);
                break;
            default:
                System.out.println("Invalid Input...");
                scan.close();

        }
    }

}
