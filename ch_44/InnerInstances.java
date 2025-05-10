class Car {
    class Speedometer {
    }

    Speedometer getSpeedometer() {
        // To make an instance of an inner class you can use `new` to invoke
        // its constructor like any other class
        return new Speedometer();
    }
}

// You cannot make an instance of Speedometer unless you first have an instance
// of Car
class Main {
    void main() {
        Car car = new Car();
        var speedometer = car.getSpeedometer();

        System.out.println(speedometer);
    }
}

Main ma = new Main();
ma.main();
// Car$Speedometer@5e5792a0
