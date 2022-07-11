import java.util.Scanner;

public class character_checking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Chracter::");
        char ch = scan.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case");

        }
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");

        }
        scan.close();
    }

}
