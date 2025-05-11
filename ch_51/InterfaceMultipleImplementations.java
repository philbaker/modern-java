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

class Cat implements Dog {
    @Override
    public void bark() {
        System.out.println("Meow");
    }

    @Override
    public String fetch(String ball) {
        return "no.";
    }
}

public class InterfaceMultipleImplementations {
    void barkAndFetch(Dog dog) {
        dog.bark();
        System.out.println(dog.fetch("Ball"));
    }

    void main() {
        barkAndFetch(new Mutt());
        // "Bark"
        // "Ball (with drool)"

        barkAndFetch(new Cat());
        // "Meow"
        // "no."
    }
}
