public class Challenges {
    public static void challengeOne() {
        String first = "1";
        String second = "2";
        String result = first + second;

        System.out.println(result); // "12"
    }

    public static void challengeTwo() {
        String first = "1";
        int second = 2;

        System.out.println(first + second); // "12"
    }

    public static void challengeThree() {
        char first = 'a';
        String second = "b";
        String third = "ab";

        System.out.println((first + second).equals(third));
    }

    public static void challengeFour() {
        char a = 'a';
        char b = 'b';
        char c = 'c';

        System.out.println(a + b + c);
    }

    public static void challengeFive() {
        String racecar = "racecar";

        int diff = 1;
        int index = 0;

        System.out.print(racecar.charAt(index));
        index += diff;
        System.out.print(racecar.charAt(index));
        index += diff;
        System.out.print(racecar.charAt(index));
        index += diff;
        System.out.print(racecar.charAt(index));
        index += diff;
        System.out.print(racecar.charAt(index));
        index += diff;
        System.out.print(racecar.charAt(index));
        index += diff;
        System.out.print(racecar.charAt(index));
        index += diff;
    }
}
