public class Challenges {
    public static void challengeOne() {
        int x = 5;
        int y = 8;
        System.out.println(x + y); // 13
    }

    public static void challengeTwo() {
        int x = 5;
        x--;
        x--;
        x = x + x;
        System.out.println(x); // 6
    }

    public static void challengeThree() {
        int x = 5;
        int y = 4;
        int z = 98;

        boolean xIsEven = x % 2 == 0;
        System.out.println(xIsEven);

        boolean yIsEven = y % 2 == 0;
        System.out.println(yIsEven);

        boolean zIsEven = z % 2 == 0;
        System.out.println(zIsEven);
    }
}
