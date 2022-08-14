import java.util.Scanner;

public class largestamongthree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the four number::");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
	  int d=scan.nextInt();
        if (a > b && a > c && a>d) {
            System.out.println("The largest number is ::" + a);
        } else if (b > a && b > c && b>d) {
            System.out.println("The largest no is::" + b);
        } else if (c>a && c>b && c>d) {
            System.out.println("The lagest no is::" + c);
        }else{
		System.out.println(d+" is the largest no..");
		}
        scan.close();
    }

}
