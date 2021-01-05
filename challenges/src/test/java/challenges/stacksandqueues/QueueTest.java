package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test public void newQueueTest(){
        Queue queue = new Queue();
        assertNotNull("new queue should be created", queue);
        assertNull("front value should be null", queue.front);
        assertNull("back value should be null", queue.back);
    }

    @Test public void isEmptyTest(){
        Queue queue = new Queue();
        assertTrue("new queue should be empty", queue.isEmpty());

        queue.enqueue(1);
        assertFalse("queue should not be empty", queue.isEmpty());
    }

    @Test public void enqueueTest(){
        Queue queue = new Queue();

        queue.enqueue(1);
        assertEquals("front value should be 1", 1, queue.front.getValue());
        assertEquals("back value should be 1", 1, queue.back.getValue());

        queue.enqueue(2);
        assertEquals("front value should be 1", 1, queue.front.getValue());
        assertEquals("back value should be 2", 2, queue.back.getValue());
    }

    @Test public void dequeueTest(){
        Queue queue = new Queue();
        assertThrows("cannot dequeue from empty queue", NullPointerException.class, () -> queue.dequeue());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals("expect front value of 1 to be removed", 1, queue.dequeue());
        assertEquals("expect new front to be 2", 2, queue.front.getValue());
    }

    @Test public void peekTest(){
        Queue queue = new Queue();
        assertThrows("cannot peek at empty queue", NullPointerException.class, () -> queue.peek());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals("should peek at front value of 1", 1, queue.peek());
    }

    @Test public void toStringTest(){
        Queue queue = new Queue();
        assertEquals("NULL", queue.toString());

        queue.enqueue(1);
        assertEquals("{1} ->NULL", queue.toString());

        queue.enqueue(2);
        assertEquals("{1} ->{2} ->NULL", queue.toString());
    }
}
