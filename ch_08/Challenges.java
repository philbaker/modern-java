public class Challenges {
    public static void ChallengeOne() {
        char x = 'x';

        System.out.println(x * x);
    }

    public static void ChallengeTwo() {
        char c = 'a';

        boolean isUppercaseLetter = (int) c >= 65 && (int) c <= 90;
        boolean isLowercaseLetter = (int) c >= 97 && (int) c <= 122;
        boolean isLetter = isUppercaseLetter || isLowercaseLetter;

        System.out.println(isLetter);
        System.out.println(Character.isLetter(c));
    }
}
