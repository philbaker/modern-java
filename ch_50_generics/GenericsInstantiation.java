class Box<T> {
    T data;
}

public class GenericsInstantiation {
    void main() {
        var boxOfString = new Box<String>();
        // "Box@53f65459"

        boxOfString.data = "abc";

        String s = boxOfString.data;

        System.out.println(s);
        // "abc"
    }
}

