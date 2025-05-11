class Box<T> {
    T data;
}

public class GenericsInference {
    void main() {
        Box<String> boxOfString = new Box<>();

        boxOfString.data = "abc";

        String s = boxOfString.data;

        System.out.println(s);
        // "abc"
    }
}
