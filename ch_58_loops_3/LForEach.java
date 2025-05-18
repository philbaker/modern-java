record Bread(String name, boolean french) {}

public class LForEach {
    Bread[] breads = {
        new Bread("Croissant", true),
        new Bread("Baguette", true),
        new Bread("Boston Brown Bread", false),
    };

    void main() {
        for (Bread bread : breads) {
            System.out.println(
                bread.name()
                + (bread.french() ? " is French" : " is not French")
            );
        }
        // Croissant is French
        // Baguette is French
        // Boston Brown Bread is not French
    }
}

