class MathConstants {
    // Because static fields are global to the entire program, they are the
    // preferred mechanism for storing "constants"
    static final double PI = 3.14;
}

public class StaticConstants {
    void main() {
        System.out.println(MathConstants.PI);
    }
}

StaticConstants st = new StaticConstants();
st.main();
// 3.14
