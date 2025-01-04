public class ConversionToIntegers {
    public static void main(String[] args) {
        double x = 5.0;
        // int y = x; - type error

        double x2 = 5.0;
        int y2 = (int) x2;

        System.out.println(y2);

        int x3 = (int) 2.1;
        int y3 = (int) 2.5;
        int z3 = (int) 2.9;

        System.out.println(x3);
        System.out.println(y3);
        System.out.println(z3);

        System.out.println((int) 4207483647.0);

        double positiveInfinity = 5.0 / 0.0;
        System.out.println((int) positiveInfinity);

        System.out.println((int) -9999999999.0);

        double negativeInfinity = -5.0 / 0.0;
        System.out.println((int) negativeInfinity);

        double nan = 0.0 / 0.0;
        System.out.println((int) nan); // 0
    }
}
