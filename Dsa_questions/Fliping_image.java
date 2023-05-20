package DSA;

public class Fliping_image {
    public static void main(String[] args) {
        int[][] nums = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        flip(nums);
    }

    public static void flip(int[][] arr) {

        int [][] result = new int [3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][arr[i].length - 1 - j];
            }
        }
        for (int i = 0; i < result.length;  i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
