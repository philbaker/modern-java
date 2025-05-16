import java.util.ArrayList;

enum Priority {
    HIGH,
    LOW
}

@interface Todo {
    String description();

    int someNumber();

    boolean isImportant();

    Class<?> someRelatedClass();

    String[] notes();

    Priority priority();
}

class Code {
}

public class AUsageWithElements {
    @Todo(
        description = "Write some code",
        someNumber = 444,
        isImportant = false,
        someRelatedClass = ArrayList.class,
        notes = {
            "this example is potentially confusing",
            "it isn't high priority enough to fix"
        },
        priority = Priority.LOW
    )

    void main() {
    }
}

