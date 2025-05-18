public class DelayedAssignment {
    public static void main(String[] args) {
        int number;
        for (number = 0; number < 5; number++) {
            System.out.println("At: " + number);
        }
        // Can still access number
        System.out.println("Ended at: " + number);

        for (int number2 = 0; number2 < 5; number2++) {
            System.out.println("At: " + number2);
        }

        // number2 is no longer available
        // System.out.println("Ended at: " + number2);
        // Error
    }
}
