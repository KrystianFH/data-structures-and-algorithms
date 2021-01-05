package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test public void newStackTest(){
        Stack stack = new Stack();

        assertNotNull("new stack should be created", stack);
        assertNull("top value in new stack should be null", stack.top);
    }
    @Test public void testPush(){
        Stack stack = new Stack();

        stack.push(4);
        assertEquals("this will push a value of 4 into the stack", 4, stack.top.getValue());

        stack.push(6);
        assertEquals("top value should now be 6", 6, stack.top.getValue());
        assertEquals("top's next value should be 4", 4, stack.top.getNext().getValue());
    }

    @Test public void isEmptyTest(){
        Stack stack = new Stack();
        assertTrue("new stack should be empty", stack.isEmpty());

        stack.push(3);
        assertFalse("stack should now have node and not be empty", stack.isEmpty());
    }

    @Test public void peekTest(){
        Stack stack = new Stack();
        assertThrows("cannot peek into empty stack", NullPointerException.class, () -> stack.peek());

        stack.push(3);
        assertEquals("should return top node with a value of 3", 3, stack.peek());
    }

    @Test public void popTest(){
        Stack stack = new Stack();
        assertThrows("cannot pop node off of an empty stack", Exception.class, () -> stack.pop());

        stack.push(1);
        stack.push(2);
        assertEquals("should pop node with value of 2 off of stack", 2, stack.pop());
        assertEquals("top node value should now be 1", 1, stack.top.getValue());
    }

    @Test public void toStringTest(){
        Stack stack = new Stack();
        assertEquals("NULL", stack.toString());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals("{3} ->{2} ->{1} ->NULL", stack.toString());
    }
}
