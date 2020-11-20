package tt.presco;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

// For the purpose of this question, the first Fibonacci number is F0 = 0; therefore,
// getNthFib(1) == F0 == 0
// getNthFib(2) == F1 == 1
public class GetNthFib {
  // Time:  O(2^n) think of each new term as a new root of a binary tree; need to recurse down all branches
  // Space: O(n)
  public static int getNthFibRecursive(int n) {
    if (n < 1) {
      throw new IllegalArgumentException(Integer.toString(n));
    } else if (n == 1 || n == 2) {
      return n - 1;
    } else {
      return getNthFibRecursive(n - 1) + getNthFibRecursive(n - 2);
    }
  }

  // Time:  O(n)
  // Space: O(1)
  public static int getNthFibStream(int n) {
    if (n < 1) throw new IllegalArgumentException(Integer.toString(n));
    return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
        .skip(n - 1)
        .findFirst()
        .get()[0];
  }

  // Time:  O(n)
  // Space: O(1)
  public static int getNthFibIterative(int n) {
    int[] fibs = {0, 1};
    while (n > 2) {
      int nextFib = fibs[1] + fibs[0];
      fibs[0] = fibs[1];
      fibs[1] = nextFib;
      n--;
    }
    return fibs[n - 1];
  }

  // Time:  O(n)
  // Space: O(n)
  public static int getNthFibMemo(int n) {
    Map<Integer, Integer> memo = new HashMap<>() {{
      put(1, 0);
      put(2, 1);
    }};
    for (int i = 3; i <= n; i++) {
      memo.put(i, memo.get(i - 1) + memo.get(i - 2));
    }
    return memo.get(n);
  }
}
