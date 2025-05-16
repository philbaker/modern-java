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

public class RGetField {
    void main() throws NoSuchFieldException {
        Class<Drink> drinkClass = Drink.class;
        // public java.lang.String Drink.name

        Field nameField = drinkClass.getField("name");
        System.out.println(nameField);
        // public java.lang.String Drink.name

        Class<Soup> soupClass = Soup.class;

        Field hasVeggiesField = soupClass.getDeclaredField("hasVeggies");
        // private boolean Soup.hasVeggies

        // soupClass.getField("hasVeggies");
        // hasVeggies is not visible to getField
        // Exception java.lang.NoSuchFieldException: hasVeggies
        //       at Class.getField (Class.java:2284)
    }
}
