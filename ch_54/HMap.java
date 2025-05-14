import java.util.HashMap;

record Character(
    String name,
    boolean protaganist
) {}

public class HMap {
    Character findCharacter(
        Character[] cast,
        String name
    ) {
        for (var character : cast) {
            if (character.name().equals(name)) {
                return character;
            }
        }
        return null;
    }

    void main() {
        Character[] carsCharacters = new Character[] {
            new Character("Tow Mater", false),
            new Character("Lightning McQueen", true),
            new Character("Doc Hudson", false)
        };

        System.out.println(findCharacter(carsCharacters, "Lightning McQueen"));
        // Character[name=Lightning McQueen, protaganist=true]

        System.out.println(findCharacter(carsCharacters, "Blade Ranger"));
        // null

        // This type of search is ok for small arrays but for big arrays it is slow

        // HashMap gives us a way to quickly look something up, regardless of how
        // many things there are to check over

        HashMap<String, Character> carsCharactersMap = new HashMap<>();

        carsCharactersMap.put(
            "Tow Mater",
            new Character("Tow Mater", false)
        );

        carsCharactersMap.put(
            "Lightning McQueen",
            new Character("Lightning McQueen", false)
        );

        carsCharactersMap.put(
            "Doc Hudson",
            new Character("Doc Hudson", false)
        );

        System.out.println(carsCharactersMap.get("Lightning McQueen"));
        // Character[name=Lightning McQueen, protaganist=false]

        System.out.println(carsCharactersMap.get("Blade Ranger"));
        // null
    }
}
