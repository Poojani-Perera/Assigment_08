public class q3 {
    public static void main(String[] args) {
        int rows = 10; // Number of rows to print

        for (int i = rows; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

