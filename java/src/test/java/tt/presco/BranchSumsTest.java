package tt.presco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import tt.presco.util.BinaryTree;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BranchSumsTest {
  public BinaryTree<Integer> root;

  @BeforeEach
  void beforeEach() {
    root = new BinaryTree<>(1).setLeft(2).setRight(3);
    root.left.setLeft(4).setRight(5);
    root.left.left.setLeft(8).setRight(9);
    root.left.right.setLeft(10);
    root.right.setLeft(6).setRight(7);
  }

  @Nested
  class BranchSumsRecursive {
    @Test
    void branchSums() {
      assertEquals(List.of(15, 16, 18, 10, 11), BranchSums.branchSumsRecursive(root));
    }
  }

  @Nested
  class BranchSumsIterative {
    @Test
    void branchSums() {
      assertEquals(List.of(15, 16, 18, 10, 11), BranchSums.branchSumsIterative(root));
    }
  }
}
