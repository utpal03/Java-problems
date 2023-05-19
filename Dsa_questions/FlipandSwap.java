public class FlipandSwap {
    public static void main(String[] args) {
        int[][] array = new int[][] {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };
        print((swapvalue(flip(array))));
    }

    public static int[][] flip(int[][] array) {
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[j][array.length - 1 - i] = array[i][j];
            }
        }
        return result;
    }

    public static int[][] swapvalue(int[][] array) {
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = 1;
                }
            }
        }
        return result;
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(array[i][j] + " " );
            }
            System.out.println();
        }
    }
}