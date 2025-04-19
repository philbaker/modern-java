public class MethodScope {
    void sayMathStuff() {
        int x = 1;
        int y = 2;

        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("x + y is " + (x + y));
    }

    void main() {
        sayMathStuff();

        // System.out.println(x);
        // Error - x does not exist here
    }
}
