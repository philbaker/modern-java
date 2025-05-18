class Muppet {
    String name;

    Muppet(String name) {
        this.name = name;
    }
}

public class ConstructorArguments {
    void main() {
        Muppet gonzo = new Muppet("Gonzo");

        System.out.println(gonzo.name);
        // Gonzo

        // Muppet gonzo = new Muppet();
        // The default constructor is no longer available now, a name must
        // be provided
    }
}
