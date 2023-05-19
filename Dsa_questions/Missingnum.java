package DSA;

import java.util.Arrays;

public class Missingnum {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 2, 1, 5, 6, 3 };
        sorted_array(nums);
    }

    public static void sorted_array(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}