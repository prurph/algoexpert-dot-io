package tt.presco.util;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
  public T value;
  public List<Node<T>> children = new ArrayList<>();

  public Node(T value) {
    this.value = value;
  }

  public Node<T> addChild(T value) {
    return this.addChild(new Node<>(value));
  }

  public Node<T> addChild(Node<T> child) {
    this.children.add(child);
    return this;
  }

  @Override
  public String toString() {
    return "Node{" +
        "value=" + value +
        ", children=" + children +
        '}';
  }
}
