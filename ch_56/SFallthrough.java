// If the code for a given label does not have a break then it will 'fall through'
// to the cases below. This is sometimes useful but can be a cause of bugs

public class SFallthrough {
    void sayWhoTheyFought(String name) {
        switch (name) {
            case "Goku":
                System.out.println("Fought Pilaf");
                System.out.println("Fought The Red Ribbon Army");
            case "Gohan": // "Goku will fall through to this case"
                System.out.println("Fought Frieza");
                System.out.println("Fought Cell");
                System.out.println("Fought Majin Buu");
        }
    }

    void main() {
        sayWhoTheyFought("Gohan");
        // Fought Frieza
        // Fought Cell
        // Fought Majin Buu
        System.out.println("-------------------");
        // -------------------
        sayWhoTheyFought("Goku");
        // Fought Pilaf
        // Fought The Red Ribbon Army
        // Fought Frieza
        // Fought Cell
        // Fought Majin Buu
    }
}
