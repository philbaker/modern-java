import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Tea {
    public void sip(int numberOfSips) {
        System.out.println("You made " + numberOfSips + " sips");
    }
}

class Apple {
    public static void bite(int times) {
        System.out.println("You took " + times + " bite" + (times < 1 ? "." : "s."));
    }
}

public class RInvokeMethod {
    void main() throws IllegalAccessException, InvocationTargetException {
        Class<Tea> teaClass = Tea.class;

        Method sipMethod;
        try {
            sipMethod = teaClass.getMethod("sip", int.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        var tea = new Tea();

        sipMethod.invoke(tea, 5);
        // You made 5 sips

        // For static methods you do not need an instance of the class to invoke
        // them. Instead you need to pass the class itself as the first argument
        // to .invoke
        Class<Apple> appleClass = Apple.class;

        Method biteMethod;
        try {
            biteMethod = appleClass.getMethod("bite", int.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        biteMethod.invoke(Apple.class, 5);
        // You took 5 bites.

        biteMethod.invoke(Apple.class, 1);
        // You took 1 bites.
    }
}
