package tt.presco;

import java.util.List;

public class ProductSum {
  // Time:  O(n)
  // Space: O(d), where d is the depth of arrays
  public static int productSumStream(List<Object> array) {
    return productSumStream(array, 1);
  }

  public static int productSumStream(Object el, int depth) {
    if (el instanceof List) {
      return depth * (int) ((List<Object>) el).stream().reduce(0,
          (first, second) -> productSumStream(first, depth + 1) + productSumStream(second,
              depth + 1));
    } else if (el instanceof Integer) {
      return (int) el;
    } else {
      throw new IllegalArgumentException("Unsupported element type: " + el.getClass().getCanonicalName());
    }
  }

  // Time:  O(n)
  // Space: O(d), where d is the depth of arrays
  public static int productSumLoop(List<Object> array) {
    return productSumLoop(array, 1);
  }

  public static int productSumLoop(List<Object> el, int depth) {
    int sum = 0;
    for (Object e : el) {
      if (e instanceof List) {
        sum += productSumLoop((List<Object>) e, depth + 1);
      } else if (e instanceof Integer) {
        sum += (int) e;
      } else {
        throw new IllegalArgumentException("Unsupported element type: " + e.getClass().getCanonicalName());
      }
    }
    return sum * depth;
  }
}
