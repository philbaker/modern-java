class Car {
    // If you mark an inner class as `static` then it becomes much closer to a 
    // normal class
    static class Speedometer {
    }
}

// You can make instances of it directly without an instance of the outer class
Car.Speedometer speedometer = new Car.Speedometer();

// Static inner classes tend to be the most common kind of inner class
