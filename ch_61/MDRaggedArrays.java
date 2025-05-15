// A ragged array is a multi-dimensional array where each array might be of a 
// different size

public class MDRaggedArrays {
    void main() {
        boolean[][] triangle = {
            { false },
            { false, false, false },
            { false, false, false, false, false },
            { false, false, false },
            { false },
        };
        // boolean[5][] { boolean[1] { false }, boolean[3] { ...  }, boolean[1] { false } }

        boolean[][] triangle2 = {
            new boolean[1],
            new boolean[3],
            new boolean[5],
            new boolean[3],
            new boolean[1],
        };
        // boolean[5][] { boolean[1] { false }, boolean[3] { ...  }, boolean[1] { false } }

        boolean[][] triangle3 = new boolean[5][];
        triangle3[0] = new boolean[1];
        triangle3[1] = new boolean[3];
        triangle3[2] = new boolean[5];
        triangle3[3] = new boolean[3];
        triangle3[4] = new boolean[1];
        // boolean[5][] { boolean[1] { false }, boolean[3] { false, false, false }, boolean[5
        // ] { false, false, false, false, false }, boolean[3] { false, false, false }, boolean[1] { false 
        // } }
    }
}
