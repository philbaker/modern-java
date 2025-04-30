class Muppet {
    boolean talented;

    // constructor
    Muppet() {
        talented = true;
    }
}

public class ConstructorDeclaration {
    void main() {
        Muppet gonzo = new Muppet();
        System.out.println(gonzo.talented);
        // true
    }
}
