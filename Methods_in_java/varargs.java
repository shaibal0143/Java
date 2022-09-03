public class varargs {
    // static int sum(int a, int b) {
    // return a + b;
    // }

    // static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // static int sum(int a, int b, int c, int d) {
    // return a + b + c + d;
    // }

    // apart from this if we use varargs then it will be easy to calculate

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 6 and 7 is::" + sum(6, 7));
        System.out.println("The sum of 6 , 7 and 6 is::" + sum(6, 7, 6));
        System.out.println("The sum of 6 , 5 , 9 and7 is::" + sum(6, 5, 9, 7));
    }

}
