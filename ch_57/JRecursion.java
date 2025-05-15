public class JRecursion {
    // In a method you can call another method

    void doOtherThing() {
        System.out.println("B");
    }

    void doThing() {
        System.out.println("A");
    }

    // You can also call the method currently running. This is called recursion
    void countDown(int value) {
        System.out.println(value);
        if (value > 0) {
            countDown(value - 1);
        }
    }

    void main() {
        doThing();
        // A

        countDown(10);
        // 10
        // 9
        // 8
        // 7
        // 6
        // 5
        // 4
        // 3
        // 2
        // 1
        // 0
    }

}
