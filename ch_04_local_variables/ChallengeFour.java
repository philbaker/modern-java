public class ChallengeFour {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";

        String c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
    }
}
