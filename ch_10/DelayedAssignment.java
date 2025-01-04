public class DelayedAssignment {
    public static void main(String[] args) {
        int age = 22;

        String message;
        if (age > 25) {
            message = "You might be able to rent a car";
        } else {
            message = "You cannot rent a car!";
        }

        System.out.println(message);

        int age2 = 22;

        String message2;

        if (age > 25) {
            message2 = "You might be able to rent a car";
        }

        // Not allowed because sometimes message2 is not initialised
        // System.out.println(message2);
    }
}
