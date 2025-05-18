public class BoxingConversion {
    void main() {
        // If you try to assign a boxed type like Integer from some code that
        // gives you the unboxed version like int, then Java will automatically
        // do that conversion
        int x = 5;
        Integer y = x;

        System.out.println(x);
        System.out.println(y);
    }
}
