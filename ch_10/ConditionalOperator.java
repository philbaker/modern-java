public class ConditionalOperator {
    public static void main(String[] args) {
        int age = 22;

        String message = age < 25
            ? "You cannot rent a car!"
            : "You might be able to rent a car";

        System.out.println(message);
    }
}
