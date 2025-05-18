public class SwitchInts {
    void winnerYear() {
        int year = 2024;
        switch (year) {
            case 2023 -> {
                System.out.println("The Chiefs");
            }
            case 2024 -> {
                System.out.println("The Chiefs");
            }
            default -> {
                System.out.println("I don't know");
            }
        }
    }

    void main() {
        winnerYear();
        // The Chiefs
    }
}
