public class EmptyInitializers {
    public static void main(String[] args) {
        int number = 0;
        for (;number < 5; number++) {
            System.out.println(number);
        }
        System.out.println("Still have number: " + number);
    }
}
