import java.lang.reflect.Constructor;

public class RGetAllConstructors {
    void main() {
        Class<AirplaneFood> airplaneFoodClass = AirplaneFood.class;

        Constructor<?>[] constructors = airplaneFoodClass.getConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        // public AirplaneFood()
        // public AirplaneFood(boolean)
    }
}
