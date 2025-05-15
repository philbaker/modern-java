public class RArray {
    void printEachTimesEight(int[] nums, int i) {
        if (i < nums.length) {
            System.out.println(nums[i] * 8);
            printEachTimesEight(nums, i + 1);
        }
    }

    void printEachTimesEight(int[] nums) {
        printEachTimesEight(nums, 0);
    }

    void main() {
        printEachTimesEight(new int[] { 1, 2, 3 });
        // 8
        // 16
        // 24
    }
}
