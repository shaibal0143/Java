package secondlecture.java;

import java.util.*;

public class area_of_circle {
    public static void main(String[] args) {

        float area;
        float pi = (float) 3.14;
        try (// Input
                Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the value of Radius::");
            int r = scan.nextInt();

            area = pi * r * r;
        }
        System.out.println("The area of Circle is::" + area);

    }

}
