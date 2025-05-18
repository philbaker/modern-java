public class NestedIfs {
    public static void main(String[] args) {
        int age = 5;

        if (age < 25) {
            System.out.println("You are too young to rent a car!");
            if (age == 24) {
                System.out.println("(but it was close)");
            }
        }
    }
}
