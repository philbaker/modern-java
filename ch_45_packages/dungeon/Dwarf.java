package dungeon;
import village.Villager;

public class Dwarf {
    BugBear fight() {
        return new BugBear();
    }

    village.Villager meet() {
        return new village.Villager();
    }

    public static void main(String[] args) {
        Dwarf dwarf = new Dwarf();
        BugBear bb = dwarf.fight();
        // village.Villager villager = dwarf.meet();
        // Syntax without import
        Villager villager = dwarf.meet();

        System.out.println("Fight result: " + bb);
        System.out.println("Met villager: " + villager);
    }
}
