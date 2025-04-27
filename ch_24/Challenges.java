class PirateShip {
    int crewSize;

    void sail() {
        System.out.println(
            this.crewSize + " sailors, ready to sail!"
        );
    }
}

class StringArrayView {
    String[] value;

    String get(int index) {
        return this.value[index];
    }

    int length() {
        return this.value.length;
    }
}

class VoiceActor {
    String firstName;
    String lastName;

    String fullName() {
        String fullName;

        if (this.firstName == null && this.lastName == null) {
            fullName = "No Name";

            return fullName;
        }

        if (this.firstName == null) {
            fullName = this.lastName;

            return fullName;
        }

        fullName = this.firstName + " " + this.lastName;

        return fullName;

    }
}

class Rectangle {
    int width;
    int height;

    public char[] toCharArray() {
        int totalLength = height * (width + 1);
        char[] result = new char[totalLength];

        int index = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[index++] = '*';
            }
            result[index++] = '\n';
        }

        return result;
    }
}

class Taco {
    boolean beef;
    boolean sourCream;
    boolean cheese;
    boolean onion;

    void addBeef() {
        this.beef = true;
    }

    void addSourCream() {
        this.sourCream = true;
    }

    void addCheese() {
        this.cheese = true;
    }

    void addOnion() {
        this.onion = true;
    }

    void deluxe() {
        this.addBeef();
        this.addSourCream();
        this.addCheese();
        this.addOnion();
    }
}

class Oscar {
    boolean grouchy;

    void setGrouchy(boolean grouchy) {
        this.grouchy = grouchy;
    }
}

public class Challenges {
    void challengeOne() {
        PirateShip ship = new PirateShip();
        ship.crewSize = 25;
        ship.sail();
        // 25 sailors, ready to sail!
    }

    void challengeTwo() {
        StringArrayView view = new StringArrayView();
        view.value = new String[] { "A", "B", "C" };

        System.out.println(view.length());
        // 3

        System.out.println(view.get(0));
        // A

        System.out.println(view.get(2));
        // C
    }

    void challengeThree() {
        VoiceActor goku = new VoiceActor();
        // VoiceActor@4b553d26

        goku.firstName = "Masako";
        goku.lastName = "Nozawa";

        String gokuFullName = goku.fullName();
        System.out.println(gokuFullName);
        // "Masako Nozawa"

        goku.firstName = null;
        String gokuFullName2 = goku.fullName();
        System.out.println(gokuFullName2);
        // "Nozawa"

        goku.lastName = null;
        String gokuFullName3 = goku.fullName();
        System.out.println(gokuFullName3);
        // "No Name"

        VoiceActor vegeta = new VoiceActor();
        vegeta.lastName = "Horikawa";
        System.out.println(vegeta.fullName());
        // Horikawa
    }

    void challengeFour() {
        Rectangle rectangle = new Rectangle(); 
        // Rectangle@2b98378d

        rectangle.width = 3;
        rectangle.height = 4;

        char[] c = rectangle.toCharArray();
        System.out.println(c);
    }

    void challengeFive() {
        var taco = new Taco();
        taco.deluxe();

        System.out.println("Has Beef: " + taco.beef);
        // Has Beef: true

        System.out.println("Has Sour Cream: " + taco.sourCream);
        // Has Sour Cream: true

        System.out.println("Has Cheese: " + taco.cheese);
        // Has Cheese: true

        System.out.println("Has Onion: " + taco.onion);
        // Has Onion: true
    }

    void challengeSix() {
        var oscar = new Oscar();
        oscar.setGrouchy(true);

        System.out.println(oscar.grouchy);
        // true
    }
}
