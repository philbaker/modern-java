// The general structure of a recursive method is that it will sometimes call
// itself and sometimes not

public class RBaseCase {
    Boolean printStuffAndComplete(int value) {
        System.out.println("Printing stuff!");
        if (value > 0) {
            // Call self
            printStuffAndComplete(value - 1);
        }

        // The base case
        return true;
    }

    void main() {
        printStuffAndComplete(5);
        // Printing stuff!
        // Printing stuff!
        // Printing stuff!
        // Printing stuff!
        // Printing stuff!
        // Printing stuff!
        // true
    }
}
