class Box<T> {
    T data;
}

public class GenericsSoundness {
    Box<String> stringBox = new Box<>();

    // This might feel innocent
    Box<Object> objectBox = stringBox;
}
