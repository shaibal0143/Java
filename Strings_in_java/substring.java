
//String Builder in java
import java.util.*;

public class substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:::");
        StringBuilder str = new StringBuilder(scan.nextLine());
        System.out.println(str);

        // finding character at an index
        System.out.println(str.charAt(0));

        // replacing a character at any index using(set charat)
        str.setCharAt(0, 'p');
        System.out.println(str);

        // inserting an character at any index using(insert)
        str.insert(2, 'p');
        System.out.println(str);

        // Delete a character using(delete)
        str.delete(2, 3);
        System.out.println(str);

        str.setCharAt(0, 's');
        System.out.println(str);
        scan.close();
    }

}
