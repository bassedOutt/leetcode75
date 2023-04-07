import com.murmylo.volodymyr.NaryTreePreorderTraversal;
import com.murmylo.volodymyr.structures.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NaryTreePreorderTraversalTest {

    @Test
    void preorder() {
        NaryTreePreorderTraversal solution = new NaryTreePreorderTraversal();
        Node node = new Node(5);
        Node node1 = new Node(4);
        Node node2 = new Node(3);
        node.children = List.of(node1, node2);
        Node node3 = new Node(2);
        node1.children = List.of(node3);
        Node node4 = new Node(1);
        node2.children = List.of(node4);
        List<Integer> preorder = solution.preorder(node);
        assertEquals(List.of(5, 4, 3, 2, 1), preorder);
    }
}
