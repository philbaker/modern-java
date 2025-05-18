class Apple {}

public class ObjectToString {
    void main() {
        Object o = "123";

        // If its already a String, toString() doesn't have to do much work
        System.out.println(o.toString());
        // "123"

        o = 123;
        System.out.println(o.toString());
        // "123"

        o = new Apple();
        System.out.println(o.toString());
        // "Apple@6737fd8f"
    }
}
