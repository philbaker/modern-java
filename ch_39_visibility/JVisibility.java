public class JVisibility {
    // When code is all in one file everything is visible
    // If there is a method you're always allowed to call it
    // If there is a field you can read it
    // If there is a class you can instantiate it etc

    void canCallThis() {
        System.out.println("of course!");
    }

    void main() {
        canCallThis();
        // of course!
    }
}
