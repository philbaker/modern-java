public class Aliasing {
    void incrementFirst(int[] numbers) {
        numbers[0] = numbers[0] + 1;
    }

    void main() {
        /* If you pass an array as an argument the array referenced by the argument
         * will be the exact same as the array referenced by the variable given
         * to the method
         */
        int[] nums = new int[] { 8 };

        System.out.println(
            "The first number is " + nums[0]
        );

        incrementFirst(nums);

        System.out.println(
            "Now it is " + nums[0]
        );
    }
}
