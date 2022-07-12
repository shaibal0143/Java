
//Substring in java
import java.util.*;

public class substring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Sentence::");
        String sen = scan.nextLine();
        System.out.println("The sentence is::" + sen);
        System.out.println(sen.substring(1, 5));
        System.out.println(sen.substring(10, sen.length()));
        scan.close();
    }
}
