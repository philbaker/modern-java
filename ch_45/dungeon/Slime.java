package dungeon;

public class Slime {
    final int size;

    // This constructor is public
    // code in other packages can use it
    public Slime() {
        this.size = 5;
    }


    // This constructor is package-private
    // code in other packages cannot use it
    Slime(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Slime slimeDefault = new Slime();
        Slime slimeCustom = new Slime(42);

        System.out.println("Default Slime size: " + slimeDefault.size);
        // Default Slime size: 5
        System.out.println("Custom Slime size: " + slimeCustom.size);
        // Custom Slime size: 42
    }
}
