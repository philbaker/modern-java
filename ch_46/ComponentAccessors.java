record Dog(String name) {}

class Main {
    void main() {
        var dog = new Dog("Hunter");

        String name = dog.name();

        // .name() accessor is available
        System.out.println(name);
        // Hunter
    }
}
