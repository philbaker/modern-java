class Car {
    int speed = 0;

    class Speedometer {
        // speed is declared here but it is a different field
        int speed = 5;

        void saySpeed() {
            System.out.println(speed); 
            // 5
            System.out.println(this.speed); 
            // 5
            System.out.println(Car.this.speed);
            // 0
        }
    }
}

class Main {
    void main() {
        var car = new Car();
        var speedometer = car.new Speedometer();
        speedometer.saySpeed();
    }
}

Main ma = new Main();
ma.main();
// 5
// 5
// 0
