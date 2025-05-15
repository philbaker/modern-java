// When you make an array where each element is itself an array the array of 
// arrays is called a "multi-dimensional array"

public class MDArrays {
    void main() {
        int width = 30;
        int height = 30;
        int[][] pixels = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                pixels[i][j] = 0;
            }
        }
    }
}
