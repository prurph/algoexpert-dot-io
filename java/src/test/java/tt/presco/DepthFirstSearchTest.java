package tt.presco;

import org.junit.jupiter.api.Test;
import tt.presco.util.Node;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepthFirstSearchTest {
  Node<String> node = new Node<>("A")
      .addChild(new Node<>("B")
        .addChild("E")
        .addChild(new Node<>("F")
            .addChild("I")
            .addChild("J")))
      .addChild("C")
      .addChild(new Node<>("D")
          .addChild(new Node<>("G")
              .addChild("K"))
          .addChild("H"));

  List<String> expected = List.of("A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H");

  @Test
  void depthFirstSearch() {
    assertEquals(expected, DepthFirstSearch.depthFirstSearch(node));
  }
}
