// Almost everything is considered to to be a "subtype" of Object
// If something is a subtype of Object, Object is its "supertype"

public class ObjectSubtypes {
    void main() {
        String oak = "oak";
        Object tree = oak;
        System.out.println(tree);
        // "oak"
    }
}
