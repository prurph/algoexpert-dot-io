package tt.presco.util;

public class BinaryTree<T> {
  public T value;
  public BinaryTree<T> left;
  public BinaryTree<T> right;

  public BinaryTree(T value) {
    this.value = value;
  }

  public BinaryTree<T> setLeft(T value) {
    this.left = new BinaryTree<>(value);
    return this;
  }

  public BinaryTree<T> setRight(T value) {
    this.right = new BinaryTree<>(value);
    return this;
  }

  @Override
  public String toString() {
    return "BinaryTree{" +
        "value=" + value +
        ", left=" + left +
        ", right=" + right +
        '}';
  }
}
