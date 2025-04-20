public class Conversion {
    double returnFive() {
        int x = 5;

        // Java automatically converts from int to double
        return x;
    }

    int returnNine() {
        double nine = 9.0;

        // Conversion from double to int is potentially lossy so you have to
        // explicitly convert it
        return (int) nine;
    }
}
