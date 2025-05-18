// Both objects with reference based and value based definitions of equals and
// hashCode are "appropriate" to use as keys in HashMaps

// The most important thing is to be careful of using objects where equals and
// hashCode are value based, but the object itself is mutable

import java.util.Objects;
import java.util.HashMap;

class Pos {
    int x;
    int y;

    Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // equals and hashCode here are defined in terms of x and y
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Pos p &&
            this.x == p.x &&
            this.y == p.y;
    }
}

public class HAppropriateKeys {
    void main() {
        var m = new HashMap<Pos, String>();

        // therefore we can get and put values using a Pos as a key
        var p = new Pos(4, 5);
        m.put(p, "Slippery Ice");

        System.out.println(
            m.get(p)
        );
        // Slippery Ice

        // But if we were to mutate the object
        p.x = 99;

        // then the original object might be in the wrong bucket inside
        // the hash map
        System.out.println(
            m.get(p)
        );
        // null

        // And because the key is stored, even if it is in the right bucket
        // the equals check might not function correctly
        System.out.println(
            m.get(new Pos(4, 5))
        );
        // null
    }
}

// While Pos has a "value based identity" you can break it by directly changing
// values

// HashMaps assume that when something is used as a key its equals and hashCode
// are stable and will not change later in the program

// If something has a value-based definition of equals and hashCode but can be
// changed, that is inappropriate to use as a key.
