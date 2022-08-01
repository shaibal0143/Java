import java.util.*;

public class predessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n1 = n + 1;
        int n2 = n - 1;
        System.out.println("Predessor of the number is::" + n2);
        System.out.println("Successor of the number is::" + n1);
        scan.close();
    }
}
