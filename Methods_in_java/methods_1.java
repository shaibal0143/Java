import java.util.Scanner;

public class methods_1 {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x * y);
        }
        return z;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c;
        c = logic(a, b);

        // Second Way to use method
        // calling the method without static (creating an object)
        // methods_1 obj = new methods_1();
        // c = obj.logic(a, b);

        System.out.println(c);
        scan.close();
    }

}
