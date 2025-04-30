class Muppet {
    final String name;
    final int age;

    Muppet(String name, int age) {
        this.name = name;

        if (age < 0) {
            throw new RuntimeException("Age cannot be negative");
        }
        this.age = age;
    }
}

public class ConstructorInvariants {
    void main() {
        Muppet bigBird = new Muppet("Big Bird", 6);
        System.out.println(
            bigBird.name + " is " + bigBird.age + " years old."
        );
        // Big Bird is 6 years old.

        // In every other part of our program we can now rely on age being a non-negative
        // number

        // Muppet gonzo = new Muppet("Gonzo", -1);
        // |  Exception java.lang.RuntimeException: Age cannot be negative
        // |        at Muppet.<init> (#116:9)
        // |        at (#119:1)
    }
}
