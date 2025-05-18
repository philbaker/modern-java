class Muppet6 {
    String name;
}

void main() {
    // When two variables point to the same instance of a class, those variables
    // will be aliases for the same data
    Muppet6 kermit4 = new Muppet6();
    Muppet6 darkKermit = kermit4;

    kermit4.name = "Kermit The Frog";

    System.out.println(kermit4.name);
    // Kermit The Frog

    System.out.println(darkKermit.name);
    // Kermit The Frog
}
