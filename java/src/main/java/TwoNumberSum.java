import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {

  public static int[] twoNumberSumHash(int[] array, int targetSum) {
    Set<Integer> nums = new HashSet<>();
    for (int num : array) {
      if (nums.contains(targetSum - num)) {
        return new int[] {num, targetSum - num};
      }
      nums.add(num);
    }
    return new int[0];
  }

  public static int[] twoNumberSumPointers(int[] array, int targetSum) {
    Arrays.sort(array);

    int left = 0;
    int right = array.length - 1;

    while (left < right) {
      int sum = array[left] + array[right];
      if (sum < targetSum) {
        left++;
      } else if (sum > targetSum) {
        right--;
      } else {
        return new int[]{array[left], array[right]};
      }
    }
    return new int[0];
  }
}
