final String monster = "Dracula";

class Mash {
    void itWasThe() {
        System.out.println(monster + " and his son");
    }
}

void main() {
    System.out.println(monster + " was there");
    // Dracula was there

    Mash mash = new Mash();
    mash.itWasThe();
    // Dracula and his son
}
