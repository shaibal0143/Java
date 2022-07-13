import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name::");
        String name = scan.nextLine();

        for (int i = 0; i < name.length(); i = i + 2) {

            System.out.print(name.charAt(i) + " ");

        }
        scan.close();

    }

}
