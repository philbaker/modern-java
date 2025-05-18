public class PosNegInfinity {
    public static void main(String[] args) {
        double positiveInfinity = 1.0 / 0.0;
        double negativeInfinity = -1.0 / 0.0;

        System.out.println(positiveInfinity > 99999999); // true
        System.out.println(negativeInfinity < 99999999); // true

        double nan = 0.0 / 0.0;

        System.out.println(positiveInfinity > nan); // false
        System.out.println(negativeInfinity < nan); // false
    }
}
