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

    public static void challengeFive() {
        int size = 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void challengeSix() {
        int width = 3;
        int height = 6;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void printLine(int spaces, int stars) {
        for (int s = 0; s < spaces; s++) {
            System.out.print(" ");
        }

        for (int a = 0; a < stars; a++) {
            System.out.print("*");
        }

        System.out.println();
    }

    public static void challengeSeven() {
        int maxStars = 8;
        int half = maxStars / 2;

        for (int i = 1; i <= half; i++) {
            int stars = i * 2;
            int spaces = maxStars - stars;
            printLine(spaces / 2, stars);
        }
    }
}
