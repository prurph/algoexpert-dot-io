package tt.presco;

import tt.presco.util.BinaryTree;

// Assumes non-null root.
public class FindClosestValueInBst {
  public static int findClosestValueInBstIterative(BinaryTree<Integer> tree, int target) {
    int closest = tree.value;
    while (tree != null) {
      // Update closest if required
      closest = Math.abs(tree.value - target) < Math.abs(closest - target) ? tree.value : closest;
      // Found target: break
      if (closest == target) {
        break;
      } else if (tree.value > target) {
        tree = tree.left;
      } else {
        tree = tree.right;
      }
    }
    return closest;
  }

  public static int findClosestValueInBstRecursive(BinaryTree<Integer> tree, int target) {
    return findClosestValueInBstRecursive(tree, target, tree.value);
  }

  private static int findClosestValueInBstRecursive(BinaryTree<Integer> tree, int target, int closest) {
    if (tree == null || target == closest) {
      return closest;
    }
    closest = Math.abs(tree.value - target) < Math.abs(closest - target) ? tree.value : closest;
    if (tree.value > target) {
      return findClosestValueInBstRecursive(tree.left, target, closest);
    } else {
      return findClosestValueInBstRecursive(tree.right, target, closest);
    }
  }
}
