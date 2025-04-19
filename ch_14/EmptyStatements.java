public class EmptyStatements {
    public static void main(String[] args) {
        for (int i = 6; i > 2;) {
            System.out.println(i);
            i--;
        }

        // Leaving the initialiser and statement blank will be functionally
        // identical to a while loop
        int number = 1;
        for (;number < 10;) {
            System.out.println(number);
            number *= 2;
        }

        // Same logic as above
        int number2 = 1;
        while (number2 < 10) {
            System.out.println(number2);
            number2 *= 2;
        }

        // This will run forever
        // for (;;) {
        //     System.out.println("Loop");
        // }
    }
}
