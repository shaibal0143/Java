
//finding sum ,difference ,Multiplication,division of 2 no.
import java.util.*;

public class operation_on_num {
    public static void sumOfNo(int a, int b) {

        int sum = a + b;
        System.out.println("The sum of Two numners is::" + sum);

    }

    public static void diffOfNo(int a, int b) {
        int diff = a - b;
        System.out.print("The difference of two numbers is::" + diff);
    }

    public static void mulOfNo(int a, int b) {
        int mul = a * b;
        System.out.print("The product of two numbers is::" + mul);
    }

    public static void divOfNo(int a, int b) {
        int div = a / b;
        System.out.println("The Division of two numbers is::" + div);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st no.::");
        int a = scan.nextInt();
        System.out.print("Enter the 2nd no.::");
        int b = scan.nextInt();
        System.out.println("\n1-addition\n2-subtraction\n3-Multiplication\n4-Division");
        System.out.println("Enter your choice::");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                sumOfNo(a, b);
                break;
            case 2:
                diffOfNo(a, b);
                break;
            case 3:
                mulOfNo(a, b);
                break;
            case 4:
                divOfNo(a, b);

        }

        scan.close();

    }

}
