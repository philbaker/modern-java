public class ObjectInstanceof {
    void main() {
        Object o = "123";

        if (o instanceof String) {
            System.out.println("The object is a String!");
            // The object is a String!
        }

        // You can also give a variable name after the type
        // This will let you call methods from the actual type
        if (o instanceof String s) {
            System.out.println(
                "Can call String methods after recovering the type: " + s.charAt(0)
            );
            // Can call String methods after recovering the type: 1
        }
    }
}
