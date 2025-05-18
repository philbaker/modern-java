enum Priority {
    HIGH,
    LOW
}

@interface Todo {
    String description();
    Priority priority() default Priority.LOW;
}

@interface Todo2 {
    String description() default "Do stuff";
    Priority priority() default Priority.LOW;
}

@interface Todo3 {
    String value();
    Priority priority() default Priority.LOW;
}

@Todo(description="Write the code")
// If all values have defaults you don't need to specify anything
@Todo2
// If value is unspecified you don't need to give a name
@Todo3("Really need to write something in here")
class Code {
    @Todo(description="Write a main method", priority=Priority.HIGH)
    void main() {
    }
}
