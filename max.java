//question no4

public class max {

    public static int findMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int max = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; 
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int max = findMax(nums);
        System.out.println("The maximum element in the array is: " + max);
    }
}