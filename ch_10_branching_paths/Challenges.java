public class Challenges {
    public static void challengeOne() {
        int x = 5;
        boolean isEven = x % 2 == 0;

        if (isEven) {
            System.out.println("The number is even");
        }
    }

    public static void challengeTwo() {
        int x = 5;
        boolean isEven = x % 2 == 0;
        String message = "The number is " + (isEven ? "even" : "odd");

        System.out.println(message);
    }

    public static void challengeThree() {
        String password = "apple";
        String validPassword = "abc123";
        String message = password == validPassword ? "allowed" : "not allowed";

        System.out.println(message);
    }
}
