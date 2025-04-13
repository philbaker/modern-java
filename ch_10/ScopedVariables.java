public class ScopedVariables {
    public static void main(String[] args) {
        int age = 5;

        if (age == 5) {
            int nextAge = age + 1;
            System.out.println(nextAge);
        }

        // Scope error
        // System.out.println(nextAge);

        if (age > 25) {
            String message = "You might be able to rent a car";
        } else {
            String message = "You cannot rent a car!";
        }

        // Another scope error
        // System.out.println(message);
    }
}
