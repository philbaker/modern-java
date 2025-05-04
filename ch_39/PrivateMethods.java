public class PrivateMethods {
    int temperature;

    // Available in this class but not in others
    private boolean shouldTurnOff() {
        return temperature > 100;
    }

    void operate() {
        if (shouldTurnOff()) {
            System.out.println("turn off");
        }

        System.out.println("keep on");
        // keep on
    }
}
