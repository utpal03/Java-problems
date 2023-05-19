import java.util.ArrayList;
import java.util.Collections;

//this code has complexity of o(n^2)

public class Findfirstmissing {
    public ArrayList<Integer> removeduplicate(ArrayList<Integer> arr) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            Integer element = arr.get(i);
            if (!nums.contains(element)) {
                nums.add(element);
            }
        }
        return nums;
    }

    public int firstMissingPositive(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr.add(nums[i]);
            }
        }
        arr = removeduplicate(arr);
        int i = 0;
        while (i < arr.size()) {
            if ((arr.get(i) != i + 1) && (arr.get(i) < arr.size())) {
                Collections.swap(arr, i, arr.get(i) - 1);
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.size(); i++) {
            if (arr.get(i) != i + 1) {
                return i + 1;
            }
        }
        return arr.size() + 1;
    }
}
