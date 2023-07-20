public class  jagged_array {
    public static void main(String[] args) {
        int r = 5;
        int count = 1;
        int arr[][] = new int[r][];
        for (int i = 0; i < arr.length; i++)
            arr[i] = new int[i + 1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++; 
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}
