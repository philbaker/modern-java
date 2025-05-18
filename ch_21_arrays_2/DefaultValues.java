public class DefaultValues {
    void main() {
        // When an array is made by just providing a size, its elemens are
        // initialized to some default value

        // int and double values are initialized to 0
        int[] digits = new int[10];
        // int[10] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }

        double[] readings = new double[5];
        // double[5] { 0.0, 0.0, 0.0, 0.0, 0.0 }

        // booleans are initialized to false
        boolean[] pokedex = new boolean[10];
        // boolean[10] { false, false, false, false, false,  ... false, false, false, false }

        // for every non-primitive type the default value is null
        String[] names = new String[10];
        // String[10] { null, null, null, null, null, null, null, null, null, null }

        Integer[] scores = new Integer[26];
        // Integer[26] { null, null, null, null, null, null, ... , null, null, null, null }
    }
}
