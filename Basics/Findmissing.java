//https://leetcode.com/problems/missing-number/description/
// This code has time complexity of O(n);(cyclic sort)

// Another way of finding missing number is the sum of all element in the array --
//-- and then substract it from the range of n natural number;

public class Findmissing {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0 };
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    public static int missingNumber(int[] nums) {
        cyclic(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void cyclic(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if ((nums[i] < nums.length) && (nums[i] != i)) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }
    }
}
