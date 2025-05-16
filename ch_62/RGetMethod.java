import java.lang.reflect.Method;

class Tea {
    public void sip() {
    }
}

class Tea2 {
    public void sip() {
    }

    public void sip(int numberOfSips) {
    }

    public void sip(String baristaName, int numberOfSips) {
    }
}

class Fruit {
    public void bite() {
    }

    void chew() {
    }

    private void swallow() {
    }
}

public class RGetMethod {
    void main() throws NoSuchMethodException {
        Class<Tea> teaClass = Tea.class;

        Method sipMethod = teaClass.getMethod("sip");
        System.out.println(sipMethod);
        // public void Tea.sip()

        // Methods which are distinct overloads of eachother are distinguished by
        // the arguments they take in
        Class<Tea2> teaClass2 = Tea2.class;
        Method sipMethod2 = teaClass2.getMethod("sip");
        System.out.println(sipMethod2);
        // public void Tea2.sip()

        sipMethod2 = teaClass2.getMethod("sip", int.class);
        System.out.println(sipMethod2);
        // public void Tea2.sip(int)

        sipMethod2 = teaClass2.getMethod("sip", String.class, int.class);
        System.out.println(sipMethod2);
        // public void Tea2.sip(java.lang.String,int)

        Class<Fruit> fruitClass = Fruit.class;
        System.out.println(fruitClass.getDeclaredMethod("bite"));
        // public void Fruit.bite()

        System.out.println(fruitClass.getDeclaredMethod("chew"));
        // void Fruit.chew()

        System.out.println(fruitClass.getDeclaredMethod("swallow"));
        // private void Fruit.swallow()
    }
}
