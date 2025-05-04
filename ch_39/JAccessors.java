class Dog {
    private String name;

    Dog(String name) {
        this.name = name;
    }

    // If a method just provides access to a field it is called an 'accessor'
    String name() {
        return this.name;
    }
}

class Main {
    void main() {
        var dog = new Dog("Daisy");

        // This won't work because name is private
        // System.out.println(dog.name);

        // This works because name() is public
        System.out.println(dog.name());
    }
}

public class JAccessors {
    void main() {
        Main main = new Main();
        main.main();
        // Daisy

        String s = "abc";
        System.out.println(
            // We can't see what fields underly this,
            // but we can access the length
            s.length()
        );
        // 3
    }
}
