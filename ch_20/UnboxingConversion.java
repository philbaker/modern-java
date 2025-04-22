public class UnboxingConversion {
    void main() {
        // If you try to use a boxed primitive in a context where the normal
        // type is expected, it will be implicitly "unboxed"

        Integer x = 5;
        int y = 3;
        int z = x * y;

        System.out.println(z);

        Boolean hasHat = true;

        if (hasHat) {
            System.out.println("You have a hat!");
        }

        // If you use one of these types like this and they happen to be null
        // you will get a NullPointerException
        Integer x2 = null;
        // int y2 = x2;
        // Error
    }
}
