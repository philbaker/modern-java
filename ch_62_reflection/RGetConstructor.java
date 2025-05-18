import java.lang.reflect.Constructor;

class AirplaneFood {
    public final boolean tastesGood;

    public AirplaneFood() {
        this.tastesGood = false;
    }

    public AirplaneFood(boolean tastesGood) {
        if (tastesGood) {
            throw new RuntimeException("Lies");
        }
        this.tastesGood  = false;
    }
}

public class RGetConstructor {
    void main() throws NoSuchMethodException {
        Class<AirplaneFood> airplaneFoodClass = AirplaneFood.class;

        Constructor<AirplaneFood> constructor = airplaneFoodClass.getConstructor();
        System.out.println(constructor);
        // public AirplaneFood()

        constructor = airplaneFoodClass.getConstructor(boolean.class);

        System.out.println(constructor);
        // public AirplaneFood(boolean)
    }
}
