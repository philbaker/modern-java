class Car {
    int speed = 0;

    class Speedometer {
        int getSpeed() {
            return speed;
        }
    }

    Speedometer getSpeedometer() {
        return new Speedometer();
    }
}
