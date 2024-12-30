public class ChallengeOne {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        boolean result = a || b && c || !d;

        System.out.println(result);
   }
}
