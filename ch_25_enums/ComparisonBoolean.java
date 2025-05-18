enum Power {
    ON,
    OFF
}

void main() {
    Power power = Power.ON;

    if (power == Power.ON) {
        System.out.println("The power is on");
    } else {
        System.out.println("The power is off");
    }
}
