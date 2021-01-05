package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    @Test public void newPseudoQueueTest(){
        PseudoQueue pseudoQueue = new PseudoQueue();
        assertNotNull("new pseudoqueue should be created", pseudoQueue);
        assertNotNull("stacks should be created", pseudoQueue.inputStack);
        assertNotNull("stacks should be created", pseudoQueue.outputStack);

        assertThrows("cannot peek at empty stack", NullPointerException.class, () -> pseudoQueue.inputStack.peek());
        assertThrows("cannot peek at empty stack", NullPointerException.class, () -> pseudoQueue.outputStack.peek());
    }

    @Test public void pseudoQEnQTest(){
        PseudoQueue pseudoQueue = new PseudoQueue();

        pseudoQueue.enqueue(4);
        assertEquals("new value should be added to inputStack", 4, pseudoQueue.inputStack.peek());
        assertThrows("cannot peek at empty stack", NullPointerException.class, ()-> pseudoQueue.outputStack.peek());
    }

    @Test public void pseudoQDeQTest(){
        PseudoQueue pseudoQueue = new PseudoQueue();
        assertThrows("both stacks empty, cannot dequeue", NullPointerException.class, ()-> pseudoQueue.dequeue());

        pseudoQueue.enqueue(4);
        pseudoQueue.enqueue(6);
        pseudoQueue.enqueue(8);

        assertEquals("first value (4) should be removed from pseudoqueue", 4, pseudoQueue.dequeue());
        assertThrows("input stack should be empty", NullPointerException.class, ()-> pseudoQueue.inputStack.peek());
        assertEquals("output stack should be 6, 8, null", "{6} ->{8} ->NULL", pseudoQueue.outputStack.toString());
    }
}
