public class DeclarationInvocation {
    void eat(String food) {
        System.out.println("I ate " + food);
    }

    void happyBirthday(String to, int age) {
        System.out.println(
            "Happy " + age + "th birthday " + to + "!"
        );
    }

    void main() {
        eat("bread");

        String veggie = "broccoli";
        eat(veggie);

        happyBirthday("Giuseppe", 42);
    }
}
