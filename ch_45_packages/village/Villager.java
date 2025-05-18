package village;

public class Villager {
    // Cannot see the classes in dungeon
    // Other packages can see Villager because it is public

    // Methods within a public class will not be public unless they have the public
    // keyword
    public void isVisible() {
        System.out.println("This method is callable from another package.");
    }

    void isNotVisible() {
        System.out.println("This method is not.");
        System.out.println("""
            This method can be called from code in the 'village'
            package, but not from other packages.
            """);
    }
}
