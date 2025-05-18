import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface Special {
    boolean isSuperDuperSpecial() default false;
}

class Drink {
    public String name;

    @Special
    public boolean caffeinated;

    @Special(isSuperDuperSpecial = true)
    public String cost;

    public int height;
}

public class AReflectiveAccess {
    void main() {
        Class<Drink> drinkClass = Drink.class;

        Field[] fields = drinkClass.getFields();

        for (var field : fields) {
            System.out.print(" " + field.getName());
            System.out.print(" - ");

            Special annotationValue = field.getAnnotation(Special.class);
            if (annotationValue == null) {
                System.out.print("is not special.");
            } else if (annotationValue.isSuperDuperSpecial()) {
                System.out.print("is super-duper special.");
            } else {
                System.out.print("is special.");
            }
        }
        // name - is not special. caffeinated - is special. cost - is super-duper special. height - is not
        // special.
    }
}
