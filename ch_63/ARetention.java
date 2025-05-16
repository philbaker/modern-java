import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
// If you want to be able to access an annotation using reflection it needs to
// be marked with a retention policy of RUNTIME
@Retention(RetentionPolicy.RUNTIME)
@interface special {
}
