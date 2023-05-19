//https://leetcode.com/problems/find-the-duplicate-number/

public class Findduplicate {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 4, 2, 2 };
        findDuplicate(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println(nums[i]);
                return;
            }
        }
        System.out.println(nums[nums.length - 1]);
        return;
    }

    public static int findDuplicate(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int j = nums[i] - 1;
            if (nums[i] != nums[j]) {
                swap(nums, i, j);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }

}