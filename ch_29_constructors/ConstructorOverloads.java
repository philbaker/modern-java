class Muppet {
    String name;
    boolean talented;

    // You can have multiple constructors so long as each constructor takes
    // different types or different numbers of arguments

    Muppet(String name) {
        this.name = name;
        this.talented = true;
    }

    Muppet(String name, boolean talented) {
        this.name = name;
        this.talented = talented;
    }
}

public class ConstructorOverloads {
    void announce(Muppet muppet) {
        System.out.print(muppet.name);
        if (muppet.talented) {
            System.out.print(" is ");
        } else {
            System.out.print(" is not ");
        }
        System.out.println("talented.");
    }

    void main() {
        Muppet fozzie = new Muppet("Fozzie");
        announce(fozzie);
        // Fozzie is talented.

        Muppet waldorf = new Muppet("Waldorf", false);
        announce(waldorf);
        // Waldorf is not talented.
    }
}
