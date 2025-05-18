public class SwitchExhaustiveness {
    String describe(int number) {
        switch (number) {
            case 1 -> {
                return "loneliest";
            }
            case 2 -> {
                return "loneliest since 1";
            }
        }

        // Since there's no default, the return is needed here
        return "Its not a number";
    }

    enum Bird {
        TURKEY,
        EAGLE,
        WOODPECKER
    }

    boolean isScary(Bird bird) {
        switch (bird) {
            case TURKEY -> {
                return true;
            }
            case EAGLE -> {
                return true;
            }
            case WOODPECKER -> {
                return false;
            }
            // default can be left off although I see errors...
            default -> {
                return false;
            }
        }
    }

    void main() {
        describe(2);
        // "loneliest since 1"

        isScary(Bird.WOODPECKER);
        // false
    }
}
