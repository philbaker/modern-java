// One of the most obvious usages for static methods is when doing things that
// are maths or maths-like

// These sorts of methods have a result computed purely from their inputs, so
// needing an instance of a class to call them is unnecessary
class MyMath {
    static int add(int a, int b) {
        return a + b;
    }
}
