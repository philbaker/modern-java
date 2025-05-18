import java.lang.reflect.Field;

class Drink {
    public String name; 
    public boolean caffeinated;

    Drink(String name, boolean caffeinated) {
        this.name = name;
        this.caffeinated = caffeinated;
    }
}

public class RReadFromField {
    void main() throws IllegalAccessException {
        Class<Drink> drinkClass = Drink.class;

        Field nameField;
        try {
            nameField = drinkClass.getField("name");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        var soda = new Drink("Soda", true);
        var water = new Drink("Water", false);

        System.out.println(nameField.get(soda));
        // Soda

        System.out.println(nameField.get(water));
        // Water
    }
}
