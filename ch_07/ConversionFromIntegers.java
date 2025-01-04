public class ConversionFromIntegers {
    public static void main(String[] args) {
        int x = 5;
        double y = x;

        System.out.println(x);
        System.out.println(y);

        int x2 = 7;
        int y2 = 2;

        double z2 = x2 / y2;

        System.out.println(z2);

        int x3 = 7;
        int y3 = 2;
        double z3 = (double) x3 / y3;

        System.out.println(z3);
    }
}
