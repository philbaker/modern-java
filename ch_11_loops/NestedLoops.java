public class NestedLoops {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        while (x != 0) {
            while (y != 0) {
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

        int x2 = 5;
        int y2 = 3;

        while (x2 != 0) {
            while (y2 != 0) {
                if (y2 == 0) {
                    break;
                }

                System.out.println(
                    "x2 is " + x2
                );

                System.out.println(
                    "y2 is " + y2
                );

                System.out.println(
                    "Sammy is a chicken"
                );

                x2--;
                y2--;
            }
        }

        int x3 = 5;
        int y3 = 3;

        while (x3 != 0) {
            if (x3 == 2) {
                break;
            }

            while (y3 != 0) {
                System.out.println(
                    "x3 is " + x3
                );

                System.out.println(
                    "y3 is " + y3
                );

                System.out.println(
                    "Daddy is a chicken"
                );

                x3--;
                y3--;
            }
        }
    }
}
