/**
 * SwitchEnums
 */
public class SwitchEnums {
    enum StopLight {
        RED,
        YELLOW,
        GREEN
    }

    void lightMessage() {
        StopLight light = StopLight.GREEN;
        switch (light) {
            case RED -> {
                System.out.println("Stop!");
            }
            case YELLOW -> {
                System.out.println("Slow down!");
            }
            case GREEN -> {
                System.out.println("Go!");
            }
        }
    }

    void main() {
        lightMessage();
        // Go!
    }
}

