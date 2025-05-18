public class JException {
    void main() {
        int x = 5 / 0;
        System.out.println("Won't get here, an exception will occur");
    }
}

// JException test = new JException();
// test.main();
// |  Exception java.lang.ArithmeticException: / by zero
// |        at JException.main (#80:3)
// |        at (#82:1)
