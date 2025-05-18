class Elmo3 {
    int age;

    void sayHello() {
        System.out.print("Hi, I'm Elmo.");
        System.out.print(" I am ");
        System.out.print(age);
        System.out.print(" years old.");
    }

    void haveBirthday() {
        age = age + 1;
    }
}

void main() {
    Elmo3 elmo3 = new Elmo3();
    // Elmo3@4b9e13df

    elmo3.age = 3;

    elmo3.sayHello();
    // Hi, I'm Elmo. I am 3 years old.

    elmo3.haveBirthday();

    elmo3.sayHello();
    // Hi, I'm Elmo. I am 4 years old.
}
