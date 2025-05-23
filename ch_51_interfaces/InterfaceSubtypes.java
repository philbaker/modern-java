// Anything which implements an interface is a subtype of that interface
// Any field or variable which holds a Dog can be assigned to an instance of Mutt

interface Dog {
    void bark();

    String fetch(String ball);
}

class Mutt implements Dog {
    @Override
    public void bark() {
        System.out.println("Bark");
    }

    @Override
    public String fetch(String ball) {
        return ball + " (with drool)";
    }
}

public class InterfaceSubtypes {
    void main() {
        // Through a Dog variable  you will be able to call any methods defined
        // on the interface. These will use the actual underlying implementation
        // in this case from Mutt

        Dog dog = new Mutt();

        dog.bark();
        // "Bark"

        System.out.println(dog.fetch("Ball"));
        // "Ball (with drool)"
    }
}
