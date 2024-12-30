public class ChallengeThree {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";

        b = a;
        a = b;
        b = a;
        a = b;

        System.out.println(a);
        System.out.println(b);
    }
}
