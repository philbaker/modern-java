enum Quality {
    SUPA_FINE,
    FINE,
    SUB_FINE
}

class Shoe {
    String name;
    Quality quality;
    final Double price;

    Shoe(String name, Quality quality) {
        this(name, quality, null);
    }

    Shoe(String name, Quality quality, Double price) {
        if (price < 0) {
            throw new RuntimeException("Price cannot be negative");
        }

        this.name = name;
        this.quality = quality;
        this.price = price;
    }
}

public class Challenges {
    void challengeOne() {
        Shoe nike = new Shoe("Nikes", Quality.SUB_FINE);
        System.out.println(
            "SHOE: " + nike.name + ", " + nike.quality
        );
        // SHOE: Nikes, SUB_FINE

        Shoe moccasin = new Shoe("Moccasins", Quality.SUPA_FINE);
        System.out.println(
            "SHOE: " + moccasin.name + ", " + moccasin.quality
        );
        // SHOE: Moccasins, SUPA_FINE
    }

    void challengeTwo() {
        Shoe jays = new Shoe("Air Jordans", Quality.FINE, 130.0);
        System.out.println(
            "SHOE: " + jays.name + ", " + jays.quality + ", $" + jays.price
        );

        Shoe nike = new Shoe("Nikes", Quality.SUB_FINE, 25.0);
        System.out.println(
            "SHOE: " + nike.name + ", " + nike.quality + ", $" + nike.price
        );
        // SHOE: Nikes, SUB_FINE, $25.0

        Shoe moccasin = new Shoe("Moccasins", Quality.SUPA_FINE);
        System.out.println(
            "SHOE: " + moccasin.name + ", " + moccasin.quality
        );
        // SHOE: Moccasins, SUPA_FINE
    }

    void challengeThree() {
        // Shoe shouldCrash = new Shoe("Base Ball Cleats", Quality.SUPA_FINE, -10.0);
        // |  Exception java.lang.RuntimeException: Price cannot be negative
        // |        at Shoe.<init> (#154:12)
        // |        at (#155:1)
    }

    void challengeFour() {
        // Already using delegation
    }
}
