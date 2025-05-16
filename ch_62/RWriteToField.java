import java.lang.reflect.Field;

class Drink {
    public String name;
    public boolean caffeinated;

    Drink(String name, boolean caffeinated) {
        this.name = name;
        this.caffeinated = caffeinated;
    }
}

public class RWriteToField {
    void main() throws IllegalAccessException {
        Class<Drink> drinkClass = Drink.class;

        Field caffeinatedField;
        try {
            caffeinatedField = drinkClass.getField("caffeinated");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        var water = new Drink("Water", false);

        caffeinatedField.set(water, true);

        System.out.println(caffeinatedField.get(water));
        // true

        var soda = new Drink("Soda", true);

        // caffeinatedField.set(soda, "yes, very much so");
        // Exception java.lang.IllegalArgumentException: Can not set boolean field to java.lang.String

        System.out.println(caffeinatedField.get(soda));
        // true
    }
}
