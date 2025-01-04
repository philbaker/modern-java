public class SquareRoot {
    public static void main(String[] args) {
        double x = 4;
        double y = Math.sqrt(x);

        System.out.println(y); // 2.0

        double x2 = 5;
        double y2 = 13;
        double z2 = Math.sqrt(9 * x2 + y2);

        System.out.println(z2);

        System.out.println(Math.sqrt(-5.2)); // NaN
    }
}
