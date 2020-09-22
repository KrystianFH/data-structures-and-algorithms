package DataStructures.linkedList;

import DataStructures.Library;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        assertEquals("k is greater than the length of ll", "Null", test.toString());
    }
}
