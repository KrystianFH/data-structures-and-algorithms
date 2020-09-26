package DataStructures.linkedList;

import DataStructures.Library;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test public void testSomeLibraryMethod() {
        LinkedList classUnderTest = new LinkedList();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testNthFromEnd() throws Exception {
        LinkedList test = new LinkedList();
        test.addToFront(2);
        test.addToFront(3);
        test.addToFront(5);
        test.addToFront(8);
        test.addToFront(9);

        test.nthFromEnd(6);
        assertThrows("n is out of bounds", Exception.class, () -> test.nthFromEnd(100));
    }

    @Test
    public void testIncludesHappy(){
        LinkedList test = new LinkedList();

        test.addToFront(1);
        test.addToFront(2);
        test.addToFront(3);
        test.addToFront(4);

        boolean actual = test.includes(3);

        assertTrue("This should be true", actual);
    }

    @Test
    public void testIncludesSad(){
        LinkedList test2 = new LinkedList();

        test2.addToFront(1);
        test2.addToFront(2);
        test2.addToFront(3);
        test2.addToFront(4);

        boolean actual = test2.includes(17);

        assertFalse("This should be false", actual);

    }

    @Test
    public void testReverse(){
        LinkedList test3 = new LinkedList();

        test3.addToFront(1);
        test3.addToFront(2);
        test3.addToFront(3);
        test3.addToFront(4);


        LinkedList.Node actual = reverseLinkedList(test3.head);
        int expected = 1;
        assertEquals("We expect the head to have a value of 1", expected, actual.value);
        assertNull("We expect the tail to have a null pointer", actual.next.next.next.next);
    }


}
