//printing marks of three subjects

public class printing_marks {
    public static void main(String[] args) {
        // 1st method to declare array
        int[] marks = new int[3];
        marks[0] = 78;
        marks[1] = 45;
        marks[2] = 90;
        // 1st method for printing

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        // 2nd method to declare array
        int[] marks2 = { 78, 79, 80 };

        // 2nd method for printing
        for (int i = 0; i < 3; i++) {
            System.out.println("The marks is:" + marks2[i]);
        }

    }

}
