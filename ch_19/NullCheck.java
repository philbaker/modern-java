public class NullCheck {
    void sayHello(String firstName, String lastName) {
        if (lastName == null) {
            System.out.println("Hello " + firstName);
        }
        else {
            System.out.println("Hello " + firstName + " " + lastName);
        }
    }

    void main() {
        sayHello("Sonny", "Bono");
        sayHello("Cher", null);
    }
}
