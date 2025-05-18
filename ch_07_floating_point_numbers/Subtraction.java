public class Subtraction {
    public static void main(String[] args) {
        double x = 5.1;
        double y = x - 9.2;

        System.out.println(x);
        System.out.println(y);

        double z = y - 0.1;
        System.out.println(z);

        int x2 = 5;
        double y2 = 4.5;
        double z2 = x2 - y2;

        System.out.println(x2);
        System.out.println(y2);
        System.out.println(z2);

        int x3 = 5;
        double y3 = 4;
        // int z3 = x3 - y3; type error - in the result cannot be an int because y3 is a double
    }
}
