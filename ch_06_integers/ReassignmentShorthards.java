public class ReassignmentShorthards {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(x);

        x = x * 5;
        System.out.println(x);

        int x2 = 1;

        // x = x + 2
        x2 += 2;

        // x = x * 4
        x2 *= 4;

        // x = x - (x * 5)
        x2 -= (x2 * 5);

        // x = x / 6
        x2 /= 6;

        // x = x % 3
        x2 %= 3;

        System.out.println(x2);

        // Adding or subtracting 1 has its own shorthand
        int x3 = 0;
        System.out.println(x3);

        x3++;
        System.out.println(x3);

        x3--;
        System.out.println(x3);
    }
}
