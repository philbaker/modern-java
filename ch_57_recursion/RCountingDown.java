public class RCountingDown {
    void countDown(int x) {
        while (x > 0) {
            System.out.println("x: " + x);
            x = x - 1;
        }
        System.out.println("DONE");
    }

    void main() {
        countDown(5);
        // x: 5
        // x: 4
        // x: 3
        // x: 2
        // x: 1
        // DONE
    }
}
