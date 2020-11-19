package tt.presco;

import tt.presco.util.Node;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
  public static <T> List<T> depthFirstSearch(Node<T> node) {
    return depthFirstSearch(node, new ArrayList<>());
  }

  private static <T> List<T> depthFirstSearch(Node<T> node, List<T> acc) {
    acc.add(node.value);
    for (Node<T> child : node.children) {
      depthFirstSearch(child, acc);
    }
    return acc;
  }
}
