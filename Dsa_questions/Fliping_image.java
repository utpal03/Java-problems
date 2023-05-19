package DSA;

public class Fliping_image {
    public static void main(String[] args) {
        int[][] nums = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        flip(nums);
        // for (int i = nums.length -1; i >= 0; i--) {
        //     for (int j = nums[i].length -1; j >= 0; j--) {
        //         System.out.print(nums[i][j]);
        //     }
        //     System.out.println();
        // }
    }

    public static void flip(int[][] arr) {

        int [][] result = new int [3][3];

        for (int i = arr.length -1; i >= 0; i--) {
            for (int j = arr[i].length -1; j >= 0; j--) {
                result[i][j] = arr[i][j];
            }
        }
        for (int i = 0; i > result.length;  i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}