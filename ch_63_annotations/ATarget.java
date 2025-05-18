import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// @Even can now only be used on fields and methods, but not classes
@Target({
    ElementType.FIELD,
    ElementType.METHOD,
})
@interface Even {
}
