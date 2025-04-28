public class SwitchStrings {
    void sayCucumber() {
        String veggie = "cucumber";

        switch (veggie) {
            case "cabbage" -> {
                System.out.println("A cabbage");
            }
            case "brussel sprout" -> {
                System.out.println("A brussel sprout");
            }
            case "cucumber" -> {
                System.out.println("A cucumber");
            }
            default -> {
                System.out.println("Other");
            }
        }
    }

    void main() {
        sayCucumber();
    }
}
