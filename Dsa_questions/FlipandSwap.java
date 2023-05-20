public class FlipandSwap {
    public static void main(String[] args) {
        int[][] array = new int[][] {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };
        print(swapValue(flip(array)));
    }

    public static int[][] flip(int[][] array) {
        int[][] result = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[i][array[i].length - 1 - j] = array[i][j];
            }
        }
        return result;
    }

    public static int[][] swapValue(int[][] array) {
        int[][] result = new int[array.length][array[0].length];
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
                System.out.printf(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
