import java.util.ArrayList;

public class Luckynumber {
    public static void main(String[] args) {
        int [][] array = new int[][] {
            {3,6},
            {7,1},
            {5,2},
            {4,8}
        };
        int answer = printArrayList(luckyNumbers(array));
        System.out.print(answer);
    }

    public static ArrayList<Integer> luckyNumbers(int[][] matrix) {

        ArrayList<Integer> rowMin = new ArrayList<Integer>();
        ArrayList<Integer> colMax = new ArrayList<Integer>();

        // finding min value of each row
        int min = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                min = matrix[row][0];
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                }
            }
            rowMin.add(min);
        }

        // finding max value of each column
        int max = matrix[0][0];
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                max = matrix[0][col];
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                }
            }
            colMax.add(max);
        }

        // finding common number in two different list:

        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (rowMin.size() > 0 && colMax.size() > 0) {
            if (rowMin.size() > colMax.size()) {
                for (int i = 0; i < colMax.size(); i++) {
                    if (rowMin.contains(colMax.get(i))) {
                        ans.add(colMax.get(i));
                    }
                }
            } else {
                for (int i = 0; i < rowMin.size(); i++) {
                    if (colMax.contains(rowMin.get(i))) {
                        ans.add(rowMin.get(i));
                    }
                }
            }
        }
        return ans;
    }
    public static int printArrayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return 0;
    }  
}
