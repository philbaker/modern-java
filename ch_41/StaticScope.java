// In the definition of a static method you can use variables like normal and
// you can reference other fields and methods
class ScopeExample {
    static final double CAN_ACCESS = 3.14;

    static void canCall() {
    }

    static void doStuff() {
        canCall();
        System.out.println(ScopeExample.CAN_ACCESS);
    }
}

ScopeExample se = new ScopeExample();
se.CAN_ACCESS;
// 3.14

// But you cannot access any non-static methods or fields. They are not in scope
class ScopeExample2 {
    final double CANNOT_ACCESS = 3.14;

    void cannotCall() {
    }

    static void doStuff() {
        // Cannot make a static reference to the non-static method cannotCall() from the type ScopeExample.ScopeExample2 [603979977]
        // cannotCall();

        System.out.println(
            // Cannot make a static reference to the non-static field CANNOT_ACCESS [33554506]
            // CANNOT_ACCESS
        );
    }
}
