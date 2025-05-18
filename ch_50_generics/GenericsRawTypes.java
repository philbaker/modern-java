class Box<T> {
    T data;
}

public class GenericsRawTypes {
    void main() {
        // If you make an instance of a generic class without any <> it is called
        // a "raw type"
        Box b = new Box();
        b.data = 123;
        b.data = "abc";

        if (b.data instanceof String s) {
            System.out.println(s);
        }
    }
}
