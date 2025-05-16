public class RClassObjects {
    void main() {
        Class<String> stringClass = String.class;
        System.out.println(stringClass);
       // class java.lang.String

        String s = "Hello";
        Class<?> stringClass2 = s.getClass();
        System.out.println(stringClass2);
        // class java.lang.String
    }
}
