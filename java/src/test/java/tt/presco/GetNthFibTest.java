package tt.presco;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GetNthFibTest {
  final static List<Integer> fibs = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);

  @Nested
  class GetNthFibRecursive {
    @Test
    void getNthFib() {
      for (int i = 0; i < fibs.size(); i++) {
        assertEquals(fibs.get(i), GetNthFib.getNthFibRecursive(i + 1));
      }
    }
  }

  @Nested
  class GetNthFibStream {
    @Test
    void getNthFib() {
      for (int i = 0; i < fibs.size(); i++) {
        assertEquals(fibs.get(i), GetNthFib.getNthFibStream(i + 1));
      }
    }
  }

  @Nested
  class GetNthFibIterative {
    @Test
    void getNthFib() {
      for (int i = 0; i < fibs.size(); i++) {
        assertEquals(fibs.get(i), GetNthFib.getNthFibIterative(i + 1));
      }
    }
  }

  @Nested
  class GetNthFibMemo {
    @Test
    void getNthFib() {
      for (int i = 0; i < fibs.size(); i++) {
        assertEquals(fibs.get(i), GetNthFib.getNthFibMemo(i + 1));
      }
    }
  }
}
