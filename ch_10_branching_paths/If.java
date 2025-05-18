public class If {
    public static void main(String[] args) {
        int age = 5;
        int ageOlder = 80;

        System.out.println(checkAge(age, 25));
        System.out.println(checkAge(ageOlder, 80));
    }

    private static String checkAge(int age, int threshold) {
        if (age < threshold) {
            return "You are too young to rent a car!";
        }

        return "You have been approved to rent a car!";
    }
}
