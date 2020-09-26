package DataStructures.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testPush(){
        Stack stack = new Stack();
        stack.push(4);
        assertEquals("this will push a value", 4, stack.top.value);
    }

    @Test
    public void testEmpty(){
        Stack stack = new Stack();
//        assertEquals("this will push a value", 0, 0);
        assertNull("should be empty", stack.top);
    }

    @Test
    public void testPop(){
        Stack stack = new Stack();
        stack.push(3);
        assertEquals("should return 3", 3, stack.pop());
        assertThrows(NullPointerException.class , ()->stack.pop());
    }

}
