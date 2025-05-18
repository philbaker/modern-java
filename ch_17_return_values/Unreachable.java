public class Unreachable {
    void doThing() {
        System.out.println("A");

        return;

        // unreachable - this code won't run
        // System.out.println("B");
    }

    void doThing2() {
        System.out.println("A");

        if (true) {
            return;
        }

        // This will still run
        System.out.println("B");
    }


    void main() {
        doThing();
    }
}
