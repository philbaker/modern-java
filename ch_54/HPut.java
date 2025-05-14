// You can associate a key with a value by calling the .put method
import java.util.HashMap;

public class HPut {
    void main() {
        var wins = new HashMap<String, Integer>();
        wins.put("Lightning McQueen", 2);
        wins.put("Tow Mater", 0);

        System.out.println(wins);
        // {Lightning McQueen=2, Tow Mater=0}
    }
}
