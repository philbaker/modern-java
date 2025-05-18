record Elf(boolean pretentious) {}

class Main {
    void main() {
        var elfOne = new Elf(true);
        var elfTwo = new Elf(true);

        // To check if the components of a record match with another you can
        // use the equals method

        System.out.println(elfOne.equals(elfTwo));
        // true
    }
}
