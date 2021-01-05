package challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test public void testSomeLibraryMethod() {
        LinkedList classUnderTest = new LinkedList();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void emptyLinkedList(){
        LinkedList emptyLinkedList = new LinkedList();

        assertEquals(null, emptyLinkedList.toString());
    }

    @Test public void addToFrontTest(){
        LinkedList testList = new LinkedList();
        assertEquals(null, testList.toString());

        testList.addToFront(1);
        testList.addToFront(2);
        testList.addToFront(3);

        assertEquals("{3} -> {2} -> {1} -> null", testList.toString());

        testList.addToFront(4);
        assertEquals("{4} -> {3} -> {2} -> {1} -> null", testList.toString());

    }

    @Test public void checkHead(){
        LinkedList testList = new LinkedList();

        testList.addToFront(1);
        testList.addToFront(2);
        testList.addToFront(3);

        assertEquals(3, testList.head.value);

        testList.addToFront(4);
        assertEquals(4, testList.head.value);

    }

    @Test public void addMultipleNodes(){
        LinkedList testList = new LinkedList();

        for(int i=0; i < 3; i++){
            testList.addToFront(7);
        }

        assertEquals("{7} -> {7} -> {7} -> null", testList.toString());
    }

    @Test public void includesTrue(){
        LinkedList testList = new LinkedList();

        testList.addToFront(10);
        testList.addToFront(20);
        testList.addToFront(30);

        assertTrue(testList.includes(10));
        assertTrue(testList.includes(20));
        assertTrue(testList.includes(30));
    }

    @Test public void includesFalse(){
        LinkedList testList = new LinkedList();

        testList.addToFront(10);
        testList.addToFront(20);
        testList.addToFront(30);

        assertFalse(testList.includes(15));
        assertFalse(testList.includes(25));
        assertFalse(testList.includes(35));
    }

    @Test public void listContents(){
        LinkedList testList = new LinkedList();

        testList.addToFront(1);
        testList.addToFront(2);
        testList.addToFront(3);
        testList.addToFront(4);
        testList.addToFront(5);

        assertEquals("{5} -> {4} -> {3} -> {2} -> {1} -> null", testList.toString());
    }

    @Test public void addToEnd(){
        LinkedList testList = new LinkedList();

        testList.addToFront(1);
        testList.addToFront(2);
        testList.addToFront(3);
        testList.addToFront(4);
        testList.addToFront(5);
        testList.append(6);

        assertEquals("{5} -> {4} -> {3} -> {2} -> {1} -> {6} -> null", testList.toString());

    }

    @Test public void insertAfterValue(){
        LinkedList testList = new LinkedList();

        testList.addToFront(1);
        testList.addToFront(2);
        testList.addToFront(3);
        testList.addToFront(4);
        testList.addToFront(5);

        testList.insertAfter(3, 7);

        assertEquals("{5} -> {4} -> {3} -> {7} -> {2} -> {1} -> null", testList.toString());

    }

    @Test public void insertBeforeValue(){
        LinkedList testList = new LinkedList();

        testList.addToFront(1);
        testList.addToFront(2);
        testList.addToFront(3);
        testList.addToFront(4);
        testList.addToFront(5);

        testList.insertBefore(3, 7);

        assertEquals("{5} -> {4} -> {7} -> {3} -> {2} -> {1} -> null", testList.toString());

    }
//
    @Test public void testNthFromEnd() throws Exception {
        LinkedList test = new LinkedList();
        test.addToFront(2);

        assertEquals("linked list of size 1", 2, test.nthFromEnd(0));

        test.addToFront(3);
        test.addToFront(4);
        test.addToFront(5);
        test.addToFront(6);

        assertEquals("linked list of size 5", 3, test.nthFromEnd(1));
        assertEquals("should return value of node n from the end", 4, test.nthFromEnd(2));

        assertThrows("throws out of bounds error when n is larger than length of list", Exception.class, () -> test.nthFromEnd(6));
        assertThrows("throws error when n is equal to length of list", Exception.class, () -> test.nthFromEnd(5));
        assertThrows("throws error when n is negative value", Exception.class, () -> test.nthFromEnd(-3));
    }

    @Test public void zipTwoLists() throws Exception{
        LinkedList test1 = new LinkedList();
        LinkedList test2 = new LinkedList();

        assertThrows("throw an exception if both lists are empty", Exception.class, () -> LinkedList.zipLists(test1, test2));

        test1.addToFront(1);
        test1.addToFront(3);
        test1.addToFront(5);
        test1.addToFront(7);

        assertEquals("should return list1 if list2 is empty", test1, LinkedList.zipLists(test1, test2));
        assertEquals("return list two if list one is empty", test1, LinkedList.zipLists(test2, test1));


        test2.addToFront(2);
        test2.addToFront(4);
        test2.addToFront(6);

        LinkedList mergedList = new LinkedList();
        mergedList.addToFront(1);
        mergedList.addToFront(2);
        mergedList.addToFront(3);
        mergedList.addToFront(4);
        mergedList.addToFront(5);
        mergedList.addToFront(6);
        mergedList.addToFront(7);

        assertEquals("zipped list should match mergedList", mergedList.toString(), LinkedList.zipLists(test1, test2).toString());
    }
}
