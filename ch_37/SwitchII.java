public class SwitchII {
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

        Action action = null;

        switch (light) {
            case RED -> {
                action = Action.STOP;
            }
            case YELLOW -> {
                action = Action.SLOW_DOWN;
            }
            case GREEN -> {
                action = Action.GO;
            }
        }

        System.out.println(action);
    }
}
