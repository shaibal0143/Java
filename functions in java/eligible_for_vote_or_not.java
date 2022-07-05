
import java.util.*;

public class eligible_for_vote_or_not {
    public static void vote(int age) {
        if (age > 18) {
            System.out.println("Eligible for Voting");

        } else {
            System.out.println("Eligible for voting");
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age::");
        int age = scan.nextInt();
        vote(age);
        scan.close();
    }

}