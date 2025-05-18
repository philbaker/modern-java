import java.lang.reflect.Field;

class Drink {
    public String name; 
    public boolean caffeinated;
}

class Soup {
    public String name;
    boolean isChicken;
    private boolean hasVeggies;
}

public class RGetAllFields {
    void main() {
        Class<Drink> drinkClass = Drink.class;

        Field[] fields = drinkClass.getFields();
        for (var field : fields) {
            System.out.println(field.getName());
        }
        // name
        // caffeinated

        // getFields will not list non-public fields
        // getDeclaredFields can do that
        Class<Soup> soupClass = Soup.class;

        System.out.println("Using getFields");
        Field[] publicFields = soupClass.getFields(); 
        // Field[1] { public java.lang.String Soup.name }

        for (var field : publicFields) {
            System.out.println(field.getName());
        }
        // name

        System.out.println("-------------");

        System.out.println("Using getDeclaredFields");
        Field[] allFields = soupClass.getDeclaredFields();
        // Field[3] { public java.lang.String Soup.name, boo ...  boolean Soup.hasVeggies }

        for (var field : allFields) {
            System.out.println(field.getName());
        }
        // name
        // isChicken
        // hasVeggies
    }
}
