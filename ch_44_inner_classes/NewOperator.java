// You can make an instance of an inner class by using .new on a variable that 
// holds an instance of the containing class
class Car {
    class Speedometer {
    }
}

class Main {
    void main() {
        Car car = new Car();
        Car.Speedometer speedometer = car.new Speedometer();
        System.out.println(speedometer);
    }
}

Main ma = new Main();
ma.main();
// Car$Speedometer@66a3ffec
