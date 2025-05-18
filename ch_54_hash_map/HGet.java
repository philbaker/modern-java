import java.util.HashMap;

public class HGet {
    void main() {
        var wins = new HashMap<String, Integer>();
        wins.put("Lightning McQueen", 2);
        wins.put("Tow Mater", 0);

        System.out.println(wins.get("Tow Mater"));
        // 0

        System.out.println(wins.get("Doc Hudson"));
        // null
    }
}
