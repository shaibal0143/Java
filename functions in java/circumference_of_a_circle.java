
//WAP to find the circumference of a circle

import java.util.*;

public class circumference_of_a_circle {
    public static void area(float r) {
        float pi = (float) 3.14;
        float ar = pi * r * r;
        System.out.println("Area of the circle is :" + ar);

    }

    public static void cir(float r) {
        float pi = (float) 3.14;
        float circumference = 2 * pi * r;
        System.out.println("The circumference of the Circle is :" + circumference);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle::");
        float r = scan.nextFloat();
        area(r);
        cir(r);
        scan.close();
    }

}
