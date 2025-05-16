enum Priority {
    HIGH,
    LOW
}

@interface Todo {
    String description();
    int someNumber();
    boolean isImportant();
    Class<?> TodoClass();
    String[] notes();
    Priority priority();
    // PersonInCharge person();
    // Error
}
