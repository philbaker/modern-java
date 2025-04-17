public class Challenges {
    public static void challengeOne() {
        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }

        int count = 0;
        int max = 16;
        while (count < max) {
            System.out.println(count);
            count++;
        }
    }

    public static void challengeTwo() {
        for (int i = 15; i >= 0; i--) {
            System.out.println(i);
        }

        int count = 15;
        int min = 0;
        while (count >= min) {
            System.out.println(count);
            count--;
        }
    }

    public static void challengeThree() {
        for (int i = 14; i > 0; i--) {
            System.out.println(i);
        }

        int count = 14;
        int min = 0;
        while (count > min) {
            System.out.println(count);
            count--;
        }
    }

    public static void challengeFour() {
        for (int i = 53; i <= 65; i += 3) {
            System.out.println(i);
        }

        int count = 53;
        int max = 65;
        while (count <= max) {
            System.out.println(count);
            count += 3;
        }
    }
}
