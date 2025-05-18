public class NotANumber {
    public static void main(String[] args) {
        double nan = 0.0 / 0.0;

        boolean equalToItself = nan == nan; // false
        System.out.println(equalToItself);

        boolean greaterThanItself = nan > nan; // false
        System.out.println(greaterThanItself);

        boolean lessThanItself = nan < nan; // false
        System.out.println(lessThanItself);

        // All false
        System.out.println(nan < 5);
        System.out.println(nan > 5);
        System.out.println(nan == 5);
    }
}
