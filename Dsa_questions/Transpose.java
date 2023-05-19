package DSA;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        transpose(matrix);

    }

    public static int [][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
        return ans;
    }
}
