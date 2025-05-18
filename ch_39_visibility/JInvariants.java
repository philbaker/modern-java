class EvenNumberHolder {
    private int value;

    EvenNumberHolder(int value) {
        // The constructor explicitly rejects an odd value
        if (value % 2 == 1) {
            throw new RuntimeException(value + " is not even");
        }

        this.value = value;
    }

    // There is no way to get an odd value now - you can only change it in steps
    // of two
    int value() {
        return this.value;
    }

    void addTwo() {
        this.value += 2;
    }

    void subtractTwo() {
        this.value -= 2;
    }
}

// EvenNumberHolder enh = new EvenNumberHolder(1);
// |  Exception java.lang.RuntimeException: 1 is not even
// |        at EvenNumberHolder.<init> (#12:7)
// |        at (#13:1)

public class JInvariants {
    void main() {
        EvenNumberHolder enh = new EvenNumberHolder(0);
        enh.value();
        // 0

        enh.addTwo();
        enh.value();
        // 2

        enh.subtractTwo();
        enh.value();
        // 0
    }
}
