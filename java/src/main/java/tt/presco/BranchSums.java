package tt.presco;

import tt.presco.util.BinaryTree;

import java.util.*;

public class BranchSums {
  public static List<Integer> branchSumsRecursive(BinaryTree<Integer> root) {
    return branchSumsRecursive(root, 0, new ArrayList<>());
  }

  private static List<Integer> branchSumsRecursive(BinaryTree<Integer> root, Integer currSum,
                                                   List<Integer> acc) {
    if (root == null) return acc;
    if (root.left == null && root.right == null) {
      acc.add(currSum + root.value);
    }
    branchSumsRecursive(root.left, currSum + root.value, acc);
    branchSumsRecursive(root.right, currSum + root.value, acc);

    return acc;
  }

  public static List<Integer> branchSumsIterative(BinaryTree<Integer> root) {
    Deque<NodeCurrSum> stack = new ArrayDeque<>();
    List<Integer> acc = new ArrayList<>();
    stack.push(new NodeCurrSum(root, 0));

    while (!stack.isEmpty()) {
      NodeCurrSum ncs = stack.pop();
      BinaryTree<Integer> node = ncs.node;
      Integer currSum = ncs.sum + node.value;
      if (node.left == null && node.right == null) {
        acc.add(currSum);
      }
      if (node.right != null) {
        stack.push(new NodeCurrSum(node.right, currSum));
      }
      if (node.left != null) {
        stack.push(new NodeCurrSum(node.left, currSum));
      }
    }

    return acc;
  }

  private static class NodeCurrSum {
    public BinaryTree<Integer> node;
    public Integer sum;

    public NodeCurrSum(BinaryTree<Integer> node, Integer sum) {
      this.node = node;
      this.sum = sum;
    }
  }
}
