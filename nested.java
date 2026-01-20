import java.util.Arrays;

class nested {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        nested sol = new nested();

        int[] numbers = { 2, 7, 11, 15 };
        int targetValue = 9;

        int[] result = sol.twoSum(numbers, targetValue);

        System.out.println("The indices are: " + Arrays.toString(result));
    }
}