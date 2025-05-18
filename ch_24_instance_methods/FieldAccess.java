class Elmo2 {
    int age;

    void sayHello() {
        System.out.println("Hi, I'm Elmo");
        System.out.print("I am ");

        // You can use elmo's name by just writing "age"
        System.out.print(age);
        System.out.println(" years old.");
    }
}

void main() {
    Elmo2 elmo2 = new Elmo2();
    // Elmo2@5c7fa833

    elmo2.age = 3;

    elmo2.sayHello();
    // Hi, I'm Elmo
    // I am 3 years old.
}
