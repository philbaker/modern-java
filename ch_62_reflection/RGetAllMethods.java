import java.lang.reflect.Method;

class Tea {
    public void sip() {
    }

    public void gulp() {
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

public class RGetAllMethods {
    void main() {
        Class<Tea> teaClass = Tea.class;

        Method[] methods = teaClass.getMethods();
        for (var method : methods) {
            System.out.println(method);
        }
        // public void Tea.sip()
        // public void Tea.gulp()
        // public boolean java.lang.Object.equals(java.lang.Object)
        // public java.lang.String java.lang.Object.toString()
        // public native int java.lang.Object.hashCode()
        // public final native java.lang.Class java.lang.Object.getClass()
        // public final native void java.lang.Object.notify()
        // public final native void java.lang.Object.notifyAll()
        // public final void java.lang.Object.wait(long) throws java.lang.InterruptedException
        // public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
        // public final void java.lang.Object.wait() throws java.lang.InterruptedException

        Class<Fruit> fruitClass = Fruit.class;

        System.out.println("Using getMethods");
        Method[] publicMethods = fruitClass.getMethods();
        for (var method : publicMethods) {
            System.out.println(method);
        }
        // public void Fruit.bite()
        // public boolean java.lang.Object.equals(java.lang.Object)
        // public java.lang.String java.lang.Object.toString()
        // public native int java.lang.Object.hashCode()
        // public final native java.lang.Class java.lang.Object.getClass()
        // public final native void java.lang.Object.notify()
        // public final native void java.lang.Object.notifyAll()
        // public final void java.lang.Object.wait(long) throws java.lang.InterruptedException
        // public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
        // public final void java.lang.Object.wait() throws java.lang.InterruptedException

        System.out.println("Using getDeclaredMethods");
        Method[] allMethods = fruitClass.getDeclaredMethods();
        for (var method : allMethods) {
            System.out.println(method);
        }
        // public void Fruit.bite()
        // void Fruit.chew()
        // private void Fruit.swallow()
    }
}
