class Elmo8 {
    int age;

    void sayHello() {
        System.out.println("Hi, I'm Elmo");
        System.out.print("I am ");
        System.out.print(this.age);
        System.out.print(" years old.");
    }
}

void main() {
    Elmo8 elmo8 = new Elmo8();
    // Elmo8@e25b2fe

    elmo8.age = 3;

    elmo8.sayHello();
    // Hi, I'm Elmo
    // I am 3 years old.
}
