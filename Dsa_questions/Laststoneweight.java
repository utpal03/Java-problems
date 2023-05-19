import java.util.Arrays;

public class Laststoneweight {
    public static void main(String[] args) {
        int[] arr = new int[] {0};
        int ans = lastStoneWeight(arr);
        System.out.println(ans);
    }

    public static int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int length = stones.length;
        if (length == 0) {
            return stones[0];
        }
        if (length == 1) {
            return stones[length - 1];
        }
        if (stones[length - 1] == stones[length - 2]) {
            int[] arr = new int[length - 2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = stones[i];
            }
            return lastStoneWeight(arr);
        }
        if (stones[length - 1] != stones[length - 2]) {
            int net = stones[length - 1] - stones[length - 2];
            int[] arr = new int[length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = stones[i];
            }
            arr[arr.length - 1] = net;
            return lastStoneWeight(arr);
        }
        return 0;
    }
}