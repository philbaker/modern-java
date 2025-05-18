import java.util.Arrays;

public class Challenges {
    public static void challengeOne() {
        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x += 1;
        }
    }

    public static void challengeTwo() {
        // 0..9
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
        }
    }

    public static void challengeThree() {
        // 0..10
        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }
    }

    public static void challengeFour() {
        // Prints nothing because the break happens on 0
        int x = 0;
        while (x < 10) {
            if (x % 3 == 0) {
                break;
            }
            System.out.println(x);
            x++;
        }
    }

    public static void challengeFive() {
        // Prints nothing because the increment never happens
        int x = 0;
        while (x < 10) {
            if (x % 3 == 0) {
                continue;
            }
            System.out.println(x);
            x++;
        }
    }

    public static void challengeSix() {
        int x = 1;
        while (x < 10) {
            int y = 2;
            while (y < 5) {
                System.out.println(x * y);
                y++;
            }

            x++;
        }
    }

    public static void challengeSeven() {
        String name = "Bridget";
        int x = 0;

        while (x < name.length()) {
            System.out.println(name.charAt(x));
            x += 1;
        }
    }

    public static void challengeEight() {
        String name = "Samantha";
        int x = name.length() - 1;

        while (x >= 0) {
            System.out.println(name.charAt(x));
            x -= 1;
        }
    }

    public static void challengeNine() {
        int x = 15;
        int y = x;

        while (x != 1) {
            if (x == y) {
                System.out.println(x);
            }

            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = (x * 3) + 1;
            }

            System.out.println(x);
        }
    }

    public static void challengeTen() {
        int start = 37;
        int end = 160;

        while (start <= end) {
            System.out.println(start);

            start += 3;
        }
    }

    public static void challengeEleven() {
        String[] vowels = {"a", "e", "i", "o", "u", "y"};
        String name = "Damien";
        int x = 0;
        int y = 0;

        while (x < name.length()) {
            String letter = String.valueOf(name.charAt(x));

            if (Arrays.asList(vowels).contains(letter.toLowerCase())) {
                System.out.println(letter);
                y += 1;
            }

            x += 1;
        }

        System.out.println("Number of vowels: " + y);
    }

    public static void challengeTwelve() {
        String[] vowels = {"a", "e", "i", "o", "u", "y"};
        String name = "Messi";
        int x = 0;
        int y = 0;

        while (x < name.length()) {
            String letter = String.valueOf(name.charAt(x));

            if (Arrays.asList(vowels).contains(letter.toLowerCase())) {
                System.out.println(letter);
                y += 1;
            }

            x += 1;
        }

        System.out.println("Number of vowels: " + y);

        if (y == (x / 2.0)) {
            System.out.println(name + " has an equal number of vowels and consonants");
        } else if (y > (x / 2.0)) {
            System.out.println(name + " is mostly vowels");
        } else {
            System.out.println(name + " is mostly consonants");
        }
    }

    public static void challengeThirteen() {
        int x = 3;
        int y = 0;

        shouldBreak:
        while (x < 100) {
            while (y < 100) {
                System.out.println("x is " + x);
                System.out.println("y is " + y);
                x = x * y;
                if (x == 0) {
                    break shouldBreak;
                }
                y++;
            }
        }

        System.out.println("Done");
    }
}
