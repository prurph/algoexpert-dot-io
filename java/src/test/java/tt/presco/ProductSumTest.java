package tt.presco;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductSumTest {
  @Nested
  class ProductSumStream {
    @Test
    void productSumFlat() {
      assertEquals(3, ProductSum.productSumStream(List.of(1, 2)));
    }

    @Test
    void productSumDepth2Single() {
      assertEquals(5, ProductSum.productSumStream(List.of(1, List.of(2))));
    }

    @Test
    void productSumDepth2Multi() {
      assertEquals(17, ProductSum.productSumStream(List.of(1, 2, List.of(3, 4))));
    }

    @Test
    void productSumComplex() {
      assertEquals(12, ProductSum.productSumStream(List.of(5, 2, List.of(7, -1), 3, List.of(6,
          List.of(-13, 8), 4))));
    }

    @Test
    void rejectsInvalidArgument() {
      assertThrows(IllegalArgumentException.class, () -> ProductSum.productSumStream(List.of(1,
          "\uD83C" +
          "\uDF49")));
    }
  }

  @Nested
  class ProductSumLoop {
    @Test
    void productSumFlat() {
      assertEquals(3, ProductSum.productSumLoop(List.of(1, 2)));
    }

    @Test
    void productSumDepth2Single() {
      assertEquals(5, ProductSum.productSumLoop(List.of(1, List.of(2))));
    }

    @Test
    void productSumDepth2Multi() {
      assertEquals(17, ProductSum.productSumLoop(List.of(1, 2, List.of(3, 4))));
    }

    @Test
    void productSumComplex() {
      assertEquals(12, ProductSum.productSumLoop(List.of(5, 2, List.of(7, -1), 3, List.of(6,
          List.of(-13, 8), 4))));
    }

    @Test
    void rejectsInvalidArgument() {
      assertThrows(IllegalArgumentException.class, () -> ProductSum.productSumLoop(List.of(1,
          "\uD83C" +
          "\uDF49")));
    }
  }
}
