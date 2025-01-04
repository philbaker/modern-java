public class ElseIf {
    public static void main(String[] args) {
        boolean cool = true;
        int age = 30;

        if (age < 25) {
            System.out.println("You cannot rent a car!");
        } else {
            if (!cool) {
                System.out.println("You have failed the vibe check.");
            } else {
                System.out.println("You are not rad enough to rent a car.");
            }
        }

        if (age < 25) {
            System.out.println("You cannot rent a car!");
        } else if (!cool) {
            System.out.println("You have failed the vibe check.");
        } else {
            System.out.println("You are not rad enough to rent a car.");
        }
    }
}
