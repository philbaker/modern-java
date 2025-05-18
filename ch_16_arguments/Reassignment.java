public class Reassignment {
    void eat(String food) {
        System.out.println("I ate " + food);
        food = "nothing";
        System.out.println("Now I have " + food);
    }

    void main() {
        String fruit = "apple";
        eat(fruit);
        System.out.println(
            "But in the caller I still have an " + fruit
        );
    }
}
