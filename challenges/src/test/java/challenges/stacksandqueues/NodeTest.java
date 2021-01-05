package challenges.stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    @Test public void newNodeTest(){
        Node node = new Node(1);
        assertNotNull("expect new node creation", node);
    }

    @Test public void getValueTest(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        assertEquals("should return value of 1", 1, node1.getValue());
    }

    @Test public void setValueTest(){
        Node node1 = new Node(1);
        node1.setValue(7);
        assertEquals("should return new value for node1", 7, node1.getValue());
    }

    @Test public void getNextTest(){
        Node node1 = new Node(1);
        assertNull("next expected value should be null", node1.getNext());
    }

    @Test public void setNextTest(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.setNext(node2);
        assertEquals("node1 next value should equal node2 value", node2, node1.getNext());
    }

    @Test public void toStringTest(){
        Node node1 = new Node(1);
        assertEquals("readable value of node1 should print out", "{1}", node1.toString());
    }
}
