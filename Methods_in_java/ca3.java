import java.util.Scanner;

public class ca3 {
    static int area_sq(int a) { 
        return (a * a);
    }

     static int perimeter_sq(int a) {
        return 4 * a;
    }

    static int area_rec(int a, int b) {
        return (a * b);
    }

    static int perimeter_rec(int a, int b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 for Square:\n 2 for Rectangle:");
        int n = scan.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter a no:");
                int a = scan.nextInt(); 
                System.out.println(area_sq(a));
                System.out.print(perimeter_sq(a));
                break;
            case 2:
                System.out.println("Enter a no:");
                int b = scan.nextInt();
                System.out.println("Enter another number:");
                int c = scan.nextInt();
                System.out.println(area_rec(b, c));
                System.out.println(perimeter_rec(b, c));
                break;

        }

    }

}
