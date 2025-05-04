public class SwitchYield {
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
        StopLight light = StopLight.GREEN;

        Action action = switch (light) {
            case RED -> {
                yield Action.STOP;
            }
            case YELLOW -> {
                yield Action.SLOW_DOWN;
            }
            case GREEN -> {
                yield Action.GO;
            }
        };

        System.out.println(action);
    }
}
