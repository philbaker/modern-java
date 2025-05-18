class Muppet {
    String name;
    boolean talented;

    // Declaring an empty constructor is the same as omitting it
    Muppet() {
    }
}

public class DefaultConstructor {
    void main() {
        Muppet gonzo = new Muppet();

        System.out.println(gonzo.name);
        // null

        System.out.println(gonzo.talented);
        // false
    }
}
