public class Challenges {
    public static void challengeOne() {
        double x = 5.1;
        double y = 2.4;
        System.out.println(x + y); // 7.5
    }

    public static void challengeTwo() {
        double x = 5.1;
        double y = 2.1;
        System.out.println(x + y); // 7.199999999999999
    }

    public static void challengeThree() {
        double x = 5 / 2;
        System.out.println(x); // 2.0
    }

    public static void challengeFour() {
        double resultOne = (int) 5.0 / 2 + 5.0 / 2;
        double resultTwo = (int) (5.0 / 2 + 5.0 / 2);

        // for resultTwo the value is calculated before being cast
        System.out.println(resultOne); // 4.5
        System.out.println(resultTwo); // 5.0
    }

    public static void challengeFive() {
        double a = 2;
        double b = 8;
        double c = 3;

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        double resultOne = (-b + Math.sqrt(discriminant)) / (2 * a);
        double resultTwo = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println(resultOne);
        System.out.println(resultTwo);
    }
}
