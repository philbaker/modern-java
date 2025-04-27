public class ExceptionStackTraces {
    void c() {
        throw new RuntimeException();
    }

    void b() {
        c();
    }

    void a() {
        b();
    }

    void main() {
        a();
    }
}

// ExceptionStackTraces test = new ExceptionStackTraces();
// test.main();
// |  Exception java.lang.RuntimeException
// |        at ExceptionStackTraces.c (#15:3)
// |        at ExceptionStackTraces.b (#15:7)
// |        at ExceptionStackTraces.a (#15:11)
// |        at ExceptionStackTraces.main (#15:15)
// |        at (#17:1)
