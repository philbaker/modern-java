public class UnderscoresIntegerLiterals {
    void main() {
        int x = 1_000_000;
        int y = 10_000_000;

        System.out.println(x);
        // 1000000

        System.out.println(y);
        // 10000000

        int white = 0xFF_FF_FF;

        System.out.println(Integer.toHexString(white));
        // ffffff
    }
}
