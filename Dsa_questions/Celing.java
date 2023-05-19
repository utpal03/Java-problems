package DSA;

public class Celing {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 3, 5, 9, 14, 16, 18 };
        int target = 50;
        int result1 = num_celing(nums, target);
        int result2 = floor(nums, target);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int num_celing(int[] arr, int target) {
        int upperbond = arr.length - 1;
        int lowerbond = 0;
        if (arr[arr.length - 1] < target) {
            return -1;
        }

        while (upperbond >= lowerbond) {

            int mid = (upperbond + lowerbond) / 2;
            if (arr[mid] > target) {
                upperbond = mid - 1;
            }
            if (arr[mid] < target) {
                lowerbond = mid + 1;
            }
            if (arr[mid] == target) {
                return target;
            }
        }
        return arr[lowerbond];
    }

    public static int floor(int[] arr, int target) {
        int upperbond = arr.length - 1;
        int lowerbond = 0;
        if (arr[0] > target) {
            return -1;
        }

        while (upperbond >= lowerbond) {

            int mid = (upperbond + lowerbond) / 2;
            if (arr[mid] > target) {
                upperbond = mid - 1;
            }
            if (arr[mid] < target) {
                lowerbond = mid + 1;
            }
            if (arr[mid] == target) {
                return target;
            }
        }
        return arr[upperbond];
    }
}