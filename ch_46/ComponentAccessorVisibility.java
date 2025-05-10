import dungeon.Dragon;

void main() {
    var dragon = new Dragon(224.5);

    // The accessor methods of a record are always public, so all the packages
    // that can see the class can access its components
    System.out.println(
        dragon.wingspan()
    );
    // 224.5
}
