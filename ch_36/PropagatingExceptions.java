public class PropagatingExceptions {
    // If a function is declared to throw an exception, that exception will have
    // to "propagate" to all calling functions

    void dream() throws Exception {
        System.out.println("Shin Godzilla's Jaw unhinging like a snake...");
    }

    void sleep() throws Exception {
        dream();
    }

    void main() throws Exception {
        sleep();
    }
}
