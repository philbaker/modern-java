class Muppet {
    final String name;
    final boolean talented = true;

    Muppet(String name) {
        this.name = name;
    }
}

public class ConstructorFinal {
    void main() {
        Muppet gonzo = new Muppet("Gonzo");
        System.out.println(gonzo.name);
        // Gonzo

        // gonzo.name = "Gonzo, the great";
        // gonzo.talented = false;
        // Cannot update the .name or .talented fields later
    }
}
