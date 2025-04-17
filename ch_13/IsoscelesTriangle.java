public class IsoscelesTriangle {
    public static void main(String[] args) {
        System.out.println("  *\n ***\n*****");

        int totalRows = 5;
        for (int row = 1; row <= totalRows; row++) {
            for (int i = 0; i < totalRows - row; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < row * 2 - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
