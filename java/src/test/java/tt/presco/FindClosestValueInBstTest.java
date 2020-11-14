package tt.presco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import tt.presco.util.BinaryTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindClosestValueInBstTest {

  public BinaryTree<Integer> root;

  @BeforeEach
  void beforeEach() {
    root = new BinaryTree<>(10).setLeft(5).setRight(15);
    root.left.setLeft(2).setRight(5);
    root.right.setLeft(13).setRight(22);
    root.right.left.setRight(14);
  }

  @Nested
  class FindClosestValueInBstIterative {
    @Test
    void findsClosest() {
      assertEquals(13, FindClosestValueInBst.findClosestValueInBstIterative(root, 12));
    }
  }

  @Nested
  class FindClosestValueInBstRecursive {
    @Test
    void findsClosest() {
      assertEquals(13, FindClosestValueInBst.findClosestValueInBstRecursive(root, 12));
    }
  }
}
