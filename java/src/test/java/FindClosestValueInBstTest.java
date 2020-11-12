import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import tt.presco.FindClosestValueInBst;
import tt.presco.util.BinaryTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindClosestValueInBstTest {

  public BinaryTree<Integer> root;

  @BeforeEach
  void beforeEach() {
    root = new BinaryTree<>(10);
    root.setLeft(5);
    root.left.setLeft(2);
    root.left.setRight(5);
    root.setRight(15);
    root.right.setLeft(13);
    root.right.left.setRight(14);
    root.right.setRight(22);
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
