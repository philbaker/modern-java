public class Final {
    // Arguments can be marked final which makes it so they cannot be reassigned
    void eat(final String food) {
        // food = "toast";
        // Not allowed
        System.out.println("I ate " + food);
    }

    void main() {
        eat("Welsh Rarebit");
    }
}
