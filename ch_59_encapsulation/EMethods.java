// The simplest mechanism for encapsulating implementation details is a method

class EMethods {
    void greet(String name) {
        System.out.println("Hello " + name);
    }

    void main() {
        greet("Flo");
        // Hello Flo
    }
}
