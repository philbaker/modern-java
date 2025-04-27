class Elmo6 {
    int age;

    void sayHello() {
        System.out.println("Hi, I'm Elmo");
        System.out.print("I am ");
        System.out.print(this.age);
        System.out.println(" years old.");
    }

    void startTheShow(String showName) {
        this.sayHello();
        System.out.println("Welcome to " + showName);
    }
}

void main() {
    Elmo6 elmo6 = new Elmo6();
    // Elmo6@6093dd95

    elmo6.age = 3;

    elmo6.startTheShow("Sesame Street");
    // Hi, I'm Elmo
    // I am 3 years old.
    // Welcome to Sesame Street
}
