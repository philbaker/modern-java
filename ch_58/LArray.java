record Drink(String name, double mgCaffeinePerCup) {}

public class LArray {
    Drink[] drinks = {
        new Drink("Black Coffee", 95),
        new Drink("Milk", 0),
        new Drink("Green Tea", 35),
    };

    void main() {
        for (int i = 0; i < drinks.length; i++) {
            Drink drink = drinks[i];

            System.out.println(
                drink.name()
                    + " has "
                    + drink.mgCaffeinePerCup()
                    + "mg caffiene per cup"
            );
            // Black Coffee has 95.0mg caffiene per cup
            // Milk has 0.0mg caffiene per cup
            // Green Tea has 35.0mg caffiene per cup
        }

        for (Drink drink : drinks) {
            System.out.println(
                drink.name()
                    + " has "
                    + drink.mgCaffeinePerCup()
                    + "mg caffiene per cup"
            );
        }
        // Black Coffee has 95.0mg caffeine per cup
        // Milk has 0.0mg caffeine per cup
        // Green Tea has 35.0mg caffeine per cup

        // Clearly the for-each loop is better here. The old style loop is still
        // useful if you need to know which element in the array you are dealing with

        // If loop actually cares to use `i` beyond just accessing
        // the right element in the array
        for (int i = 0; i < drinks.length; i++) {
            Drink drink = drinks[i];

            // Which you might want for display logic
            System.out.println(
                "[" + i + "]: " + drink.name()
            );

            // Or to mutate the original array
            drinks[i] = new Drink(
                drink.name(),
                drink.mgCaffeinePerCup() + 100
            );
        }
        // [0]: Black Coffee
        // [1]: Milk
        // [2]: Green Tea
    }
}
