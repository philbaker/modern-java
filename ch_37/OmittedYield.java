public class OmittedYield {
    enum StopLight {
        RED,
        YELLOW,
        GREEN
    }

    enum Action {
        STOP,
        SLOW_DOWN,
        GO
    }

    void main() {
        // If a branch of a switch just yields a value but does nothing else
        // interesting you can omit the `yield` along with the surrounding { and }

        StopLight light = StopLight.GREEN;

        Action action = switch (light) {
            case RED -> Action.STOP;
            case YELLOW -> Action.SLOW_DOWN;
            case GREEN -> Action.GO;
        }

        System.out.println(action);
        // GO

        // This can be mixed with cases that have explicit yields and might do
        // other things

        Action action2 = switch (light) {
            case RED -> Action.STOP;
            case YELLOW -> {
                System.out.println("Lemon Light!");
                yield Action.SLOW_DOWN;
            }
            case GREEN -> Action.GO;
        }

        System.out.println(action2);
        // GO
    }
}
