// All interfaces do is hold method declarations
interface Dog {
    void bark();

    String fetch(String ball);
}

// If you want to have a class which implements the interface you can do so
// by writing `implements` followed by the interface name
class Mutt implements Dog {
    // Then you need to declare the methods which match up with the methods
    // defined in the interface
    // public needs to be written when implementing a method from an interface
    public void bark() {
        System.out.println("Bark");
    }

    public String fetch(String ball) {
        return ball + " (with drool)";
    }
}

public class InterfaceImplementation {
    void main() {
        Mutt mutt = new Mutt();

        mutt.bark();
        // "Bark"

        mutt.fetch("tennis ball");
        // "tennis ball (with drool)"
    }
}
