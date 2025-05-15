public class LInferredTypes {
    // A variable declaration in a for-each loop can make use of var to infer
    // its type

    void main() {
        String[] chairMaterials = { "wicker", "wood", "plastic" };
        for (var chairMaterial : chairMaterials) {
            System.out.println(chairMaterial);
        }
        // wicker
        // wood
        // plastic
    }
}
