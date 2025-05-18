public class LabeledBreak {
    public static void main(String[] args) {
        // outerLoop:
        // while (true) {
        //     while (true) {
        //         break outerLoop;
        //     }
        // }

        int x = 5;
        int y = 3;

        xLoop:
        while (x != 0) {
            while (y != 0) {
                if (x == 2 && y == 2) {
                    break xLoop;
                }

                System.out.println(
                    "x is " + x
                );
                System.out.println(
                    "y is " + y
                );

                x--;
                y--;
            }
        }

        System.out.println("done.");
    }
}
