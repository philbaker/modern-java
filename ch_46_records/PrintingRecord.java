record Goblin(String name, int hp) {}

class Main {
    void main() {
        var goblin = new Goblin("Gobbo", 11);

        // When printing a record the output will include each of the components
        // of the record
        System.out.println(goblin);
        // Goblin[name=Gobbo, hp=11]
    }
}
