// This is shorthand for
public record CatR(boolean spayed, int weight) {}

// This
public class CatC {
    private final boolean spayed;
    private final int weight;

    public CatC(boolean spayed, int weight) {
        this.spayed = spayed;
        this.weight = weight;
    }

    public boolean spayed() {
        return this.spayed;
    }

    public int weight() {
        return this.weight;
    }
}


void main() {
    CatR catr = new CatR(true, 50);
    System.out.println(catr);
    // CatR[spayed=true, weight=50]

    System.out.println(catr.spayed());
    // true

    System.out.println(catr.weight());
    // 50

    CatC catc = new CatC(true, 50);
    System.out.println(catc);
    // CatC@3dd4520b

    System.out.println(catc.spayed());
    // true

    System.out.println(catc.weight());
    // 50
}
