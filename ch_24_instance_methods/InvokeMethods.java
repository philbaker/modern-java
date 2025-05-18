class Elmo5 {
    int age;

    void sayHello() {
        System.out.println("Hi, I'm Elmo");
        System.out.print("I am ");
        System.out.print(age);
        System.out.println(" years old.");
    }

    void startTheShow(String showName) {
        sayHello();
        System.out.println("Welcome to " + showName);
    }
}

void main() {
    Elmo5 elmo5 = new Elmo5();
    // Elmo5@42d80b78

    elmo5.age = 3;

    elmo5.startTheShow("Sesame Street");
    // Hi, I'm Elmo
    // I am 3 years old.
    // Welcome to Sesame Street
}
