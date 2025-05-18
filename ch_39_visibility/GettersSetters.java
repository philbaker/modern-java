// Java went through a getters and setters phase. There is no need to replicate
// Person when Person2 will suffice

class Person {
    private String name;
    private int age;

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int age) {
        this.age = age;
    }
}

class Person2 {
    String name;
    int age;
}
