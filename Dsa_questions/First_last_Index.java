package DSA;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class First_last_Index {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[] { -1, -1 };
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                result[1] = i;
            }
            if (nums[nums.length - 1 - i] == target) {
                result[0] = nums.length - 1 - i;
            }
        }
        return result;
    }

    public static int search(int[] nums, int target, boolean firstindex) {
        int result = -1;
        int start = 0;
        int end = nums.length - 1;

        while (end >= start) {
            int mid = start + end - start / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                result = mid;
                if (firstindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return result;
    }

    public static int[] index(int[] nums, int target) {
        int[] result = { -1, -1 };
        result[0] = search(nums, target, true);
        result[1] = search(nums, target, false);
        return result;
    }

    public static void main(String[] args) {
        int nums[] = new int[] { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        // System.out.println(Arrays.toString(searchRange(nums, target)));
        int [] ans = index(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}
