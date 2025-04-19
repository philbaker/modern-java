public class For {
    public static void main(String[] args) {
        for (int number = 0; number < 10; number++) { // initializer, expression
            System.out.println(number); // statement
        }

        int number = 0;
        while (number < 10) {
            System.out.println(number);

            number += 1;
        }
    }
}
